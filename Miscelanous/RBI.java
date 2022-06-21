package Miscelanous;

public interface RBI {

		
	String str="tdtr";
	void withdraw();

	void deposit();

	public default void adhartLink() {
		System.out.println("Default method is implemented");
	}

	public default void minBal() {
		System.out.println("Min balance is 1000");
	}

}

class SBIC implements RBI {


	
	@Override
	public void withdraw() {
		System.out.println("Sbi withdraw");

	}

	@Override
	public void deposit() {
		System.out.println("Sbi deposit");

	}

	public void adhartLink() {
		System.out.println("Connect to bank...");
	}
	
    
	public void minBal() {
	 String balance =RBI.str;
     
     System.out.println(balance);
     
		System.out.println("Min balance is SBI balance");
	}

	
	
}

class Axis implements RBI {

	@Override
	public void withdraw() {
		System.out.println("Axis withdraw");

	}
	
	@Override
	public void deposit() {
		System.out.println("Axis deposit");

	}
}

class Pnb implements RBI {

	String Pnb ="pnb";
	
	@Override
	public void withdraw() {
		System.out.println("Pnb withdraw");

	}

	@Override
	public void deposit() {
		System.out.println("Pnb deposit");

	}

}
