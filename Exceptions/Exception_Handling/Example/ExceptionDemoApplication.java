package Exceptions.Exception_Handling.Example;

public class ExceptionDemoApplication {

	public static void main(String[] args) {

		try {
			BankAccount bankAccount = new BankAccount("John", 500);
			bankAccount.withdraw(980);
			System.out.println("Current amount is " + bankAccount.amount);
			BankAccount bankAccount1 = new BankAccount("Anna", -4100);
			System.out.println("Current amount is " + bankAccount1.amount);
		} catch (RuntimeException | InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("End program...");

	}

}
