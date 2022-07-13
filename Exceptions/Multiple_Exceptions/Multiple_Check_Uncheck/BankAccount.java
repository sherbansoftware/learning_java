package Exceptions.Multiple_Exceptions.Multiple_Check_Uncheck;

public class BankAccount {
	public String owner;
	public int amount;

	public BankAccount(String owner, int amount) {

		if (amount < 0) {
			 throw new RuntimeException("Cannot create a balance with negative amount " + amount);
			
		} 

		this.owner = owner;
		this.amount = amount;

	}

	public void withdraw(int amountToWithdraw) throws InsufficientFundsException {

		if (amount - amountToWithdraw < 0) {

			throw new InsufficientFundsException("You need " + -1 * (amount - amountToWithdraw) + " lei");

		}
		this.amount -= amountToWithdraw;
	}

}
