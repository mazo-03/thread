package task4;

import static task4.BankAccount.balance;

public class AccountingThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            BankAccount.deposit(i*20);
            System.out.println("Deposited " + i *20 + " money. Acc balance = " + BankAccount.getBalance() );
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            BankAccount.withdraw(i * 20);
            System.out.println("Withdrawn " + i*20 + " money. Acc balance = " + BankAccount.getBalance());
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
