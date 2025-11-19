public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(1000);
        BankAccount a2 = new BankAccount(5000);

        System.out.println(a1.calculateInterest());
        System.out.println(a2.calculateInterest());
    }
}
