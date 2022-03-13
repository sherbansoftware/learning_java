package Miscelanous;

public class Water implements IWine {

	public void drink() {
		System.out.println("From water glass");
	}

	@Override
	public String toString() {

		return "This is water Method";
	}
}
