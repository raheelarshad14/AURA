public class BankAccount {
    int balance;
    final static double interestRate = 2.0 / 100;

    public BankAccount(int balance) {
        this.balance = balance;
    }
     double calculateInterest(){
        double interest = interestRate * balance;
        return interest;
     }
}
