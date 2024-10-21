package task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Letters extends Thread{
    private String word;
    private ArrayList<Thread> threads;

    public Letters(String word) {
        this.word = word;
        threads = new ArrayList<>();
    }
    public void run() {
        for (int i = 0; i < word.length(); i++) {
            System.out.println("Thread " + word.charAt(i));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void add(Thread thread) {
        threads.add(thread);
    }

    public Thread[] getThreads(){
        List<Thread> threads = new ArrayList<Thread>();
        threads.add(new Thread(this));
        return threads.toArray(new Thread[threads.size()]);
    }
}
