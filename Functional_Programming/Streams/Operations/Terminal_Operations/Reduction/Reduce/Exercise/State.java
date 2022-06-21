package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Reduce.Exercise;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

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
                //  .map(d -> d.dailyActiveCases())
                .map(District::dailyActiveCases)
                .reduce(Integer::sum);
    }

    public Optional<District> districtWithLowestCases() {
        return districts.stream()
                .reduce((d1, d2) ->
                        Integer.compare(d1.dailyActiveCases(), d2.dailyActiveCases()) <= 0 ? d1 : d2);
    }

    public Optional<District> districtWithHighestCases() {
        return districts.stream()
                .reduce((d1, d2) ->
                        Integer.compare(d1.dailyActiveCases(), d2.dailyActiveCases()) <= 0 ? d2 : d1);
    }

    public static void main(String[] args) {
        District d1 = new District("Hyderabad", 250);
        District d2 = new District("Medak", 200);
        District d3 = new District("Siddipet", 275);

        List<District> districts = List.of(d1, d2, d3);
        State s1 = new State("Telangana", districts);

        Optional<Integer> result1 = s1.dailyActiveCases();
        System.out.println("Active cases in the last 24 h: " + result1.get());

        Optional<District> result2 = s1.districtWithLowestCases();
        System.out.println("District with lowest cases: " + result2.get().name());

        Optional<District> result3 = s1.districtWithHighestCases();
        System.out.println("District with highest cases: " + result3.get().name());


    }


}
