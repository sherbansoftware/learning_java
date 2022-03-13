package miscellaneous.miscelanous;

public class Main {
    public static void main(String[] args) {
        Account chrysAccount = new Account("Tim");
        chrysAccount.deposit(1000);
        chrysAccount.withdraw(500);
        chrysAccount.withdraw(-200);
        chrysAccount.deposit(-30);
        chrysAccount.calculateBalance();
        System.out.println("Balance on account is " + chrysAccount.getBalance());
    }
}
