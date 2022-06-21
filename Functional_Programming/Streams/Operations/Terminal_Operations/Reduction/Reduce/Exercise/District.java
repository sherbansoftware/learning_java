package Functional_Programming.Streams.Operations.Terminal_Operations.Reduction.Reduce.Exercise;

public class District {
	
	private String name;
	private int dailyActiveCases;
	
	public District(String name, int dailyActiveCases) {
		super();
		this.name = name;
		this.dailyActiveCases = dailyActiveCases;
	}
	
	public String name() {
		return name;
	}
	
	public int dailyActiveCases() {
		return dailyActiveCases;
	}	
}