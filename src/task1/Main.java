package task1;

public class Main {
    public static void main(String[] args) {
        GS t1 = new GS("Thread1");
        GS t2 = new GS("Thread2");

        t1.start();
        t2.start();
    }
}