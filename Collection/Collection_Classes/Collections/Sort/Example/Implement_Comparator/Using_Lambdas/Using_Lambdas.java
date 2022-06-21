package Collection.Collection_Classes.Collections.Sort.Example.Implement_Comparator.Using_Lambdas;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Using_Lambdas {

    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));


        // using lambda expressions
       // Comparator<Student> byRoll = (s1, s2) -> Integer.compare(s1.getRollno(), s2.getRollno());

        // using method references
        Comparator<Student> byRoll =Comparator.comparing(Student::getRollno).reversed();
        Collections.sort(ar, byRoll);
        System.out.println(ar);
    }
}