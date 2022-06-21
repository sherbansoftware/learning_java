package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Collect.AsCollection.Exercise;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class State {
	private String name;
	private Collection<District> districts;
	
	public State(String name, Collection<District> districts) {
		super();
		this.name = name;
		this.districts = districts;
	}
	
	public String name() {
		return name;
	}
	
	public Collection<District> districts() {
		return districts;
	}	
	
	public Optional<Integer> dailyActiveCases() {
		return districts.stream()
				.map(District::dailyActiveCases)
				.reduce(Integer::sum);		
	}	
		
	public Optional<District> districtWithLowestCases() {
		return districts.stream()
				.reduce((d1, d2) -> Integer.compare(d1.dailyActiveCases(), d2.dailyActiveCases()) <= 0 ? d1 : d2);
	}
	
	public Optional<District> districtWithHighestCases() {
		return districts.stream()
				.reduce((d1, d2) -> Integer.compare(d1.dailyActiveCases(), d2.dailyActiveCases()) <= 0 ? d2 : d1);
	}
	
	public List<District> districtsWithNMostCases(int n) {
		TreeSet<District> orderedDistricts = districts.stream()
				.collect(Collectors.toCollection(() -> 
						new TreeSet<District>((d1, d2) -> Integer.compare(d1.dailyActiveCases(), d2.dailyActiveCases()) <= 0 ? 1 : -1)));
		
		return orderedDistricts.stream().limit(n).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		// Some sample data
		District d1 = new District("Hyderabad", 250);
		District d2 = new District("Medak", 200);
		District d3 = new District("Siddipet", 275);
		List<District> districts = List.of(d1, d2, d3);		
		State s1 = new State("Telangana", districts);
		
		Optional<Integer> result1 = s1.dailyActiveCases();
		System.out.println("Active cases in the last 24 hours: " + result1.get());
		
		Optional<District> result2 = s1.districtWithLowestCases();
		System.out.println("District with lowest cases: " + result2.get().name());
		
		Optional<District> result3 = s1.districtWithHighestCases();
		System.out.println("District with highest cases: " + result3.get().name());
		
	}
}
