package task2;

public class MyThread implements Runnable {
    private String name;
    public MyThread(String name) {
        this.name = name;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " -> " + i);
        }
    }
}
