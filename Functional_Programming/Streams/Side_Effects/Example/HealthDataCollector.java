package Functional_Programming.Streams.Side_Effects.Example;

// https://www.udemy.com/course/functional-programming-in-java-using-lambdas-and-streams/learn/lecture/26606102#questions

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import static java.util.stream.Collectors.*;

public class HealthDataCollector {
	
	private Collection<Patient> patientList = new ArrayList<>();
	
	private int count = 0;
	private List<Patient> diabeticPatients = new ArrayList<>();
	private double avgAge = 0.0;
		
	public int getCount() {
		return count;
	}

	public List<Patient> getDiabeticPatients() {
		return diabeticPatients;
	}

	public double getAvgAge() {
		return avgAge;
	}

	public HealthDataCollector() {
		// Say patients in California!
		for (int i = 0; i < 5000000; i++) {
			int age = ThreadLocalRandom.current().nextInt(25, 90 + 1);
			boolean diabetic = ThreadLocalRandom.current().nextInt(0, 2) == 1 ? true : false;
			
			patientList.add(new Patient(age, diabetic));
		}
	}
	
	public void collectDataImpure() {
		count = 0;
		diabeticPatients.clear();
		avgAge = 0.0;		
		
		int ageSum = patientList.stream().parallel()
			.filter(patient -> {
				if (patient.isDiabetic()) {
					// synchronized(this) {
						count++;
						diabeticPatients.add(patient);
					//}				
					
					return true;
				}
				
				return false;
			}).map(patient -> patient.age()).reduce(Integer::sum).get();
		
		avgAge = ageSum/count;
		
				
	}
	
	public void collectDataPure() {
		count = 0;
		diabeticPatients.clear();
		avgAge = 0.0;		
		
		diabeticPatients = patientList.stream().parallel()
			.filter(Patient::isDiabetic)
			.collect(toList());
		
		count = diabeticPatients.size();
			
		int ageSum = diabeticPatients.parallelStream().map(Patient::age).reduce(Integer::sum).get();
		
		avgAge = ageSum/count;
		
				
	}
		
		
	public static void main(String[] args) {
		HealthDataCollector hdc = new HealthDataCollector();
		
		long startTime = System.nanoTime();
		for (int i = 0; i < 5; i++) {
			hdc.collectDataImpure();
			System.out.println("Count: " + hdc.getCount() + ", Avg. Age: " + hdc.getAvgAge() + ", diabeticPatients count: " + hdc.getDiabeticPatients().size());
		}
		System.out.println("Time elapsed: " + (System.nanoTime() - startTime));
		
		startTime = System.nanoTime();
		for (int i = 0; i < 5; i++) {
			hdc.collectDataPure();
			System.out.println("Count: " + hdc.getCount() + ", Avg. Age: " + hdc.getAvgAge() + ", diabeticPatients count: " + hdc.getDiabeticPatients().size());
		}
		System.out.println("Time elapsed: " + (System.nanoTime() - startTime));
		
	}
	
	public static class Patient {
		int age;
		boolean diabetic;
		
		public Patient(int age, boolean diabetic) {
			super();
			this.age = age;
			this.diabetic = diabetic;
		}

		public int age() {
			return age;
		}

		public boolean isDiabetic() {
			return diabetic;
		}		
	}
}
