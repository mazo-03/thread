package task2;

public class Main {
    public static void main(String[] args) {
        MyThread run1 = new MyThread("mazo");
        MyThread run2 = new MyThread("mazo");

        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);

        t1.start();
        t2.start();
    }
}
