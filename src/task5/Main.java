package task5;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Letters letters = new Letters("ABCD");

        letters.add(letters);

        for (Thread t : letters.getThreads()) {
            System.out.println(t.getName());
            letters.start();
            try {
                sleep(5000);
                System.out.println("The program has finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
