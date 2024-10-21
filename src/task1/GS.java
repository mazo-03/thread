package task1;

public class GS extends Thread{
    private String TName;

    public GS(String TName) {
        this.TName = TName;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(TName + " -> " + i + 1);
            i++;
        }
    }
}
