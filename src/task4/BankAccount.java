package task4;

public class BankAccount {
    public static int balance;
    public BankAccount(int balance) {
        this.balance = balance;
    }
    public static int getBalance() {
        return balance;
    }
    public static synchronized void deposit(int amount) {
        balance += amount;
    }
    public static synchronized void withdraw(int amount) {
        if(balance <= amount) {
            amount = 0;
        }
        balance -= amount;
    }
}
