package task4;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);

        AccountingThread thread = new AccountingThread();
        thread.start();

        System.out.println("Get balance: " + BankAccount.getBalance());
    }
}
