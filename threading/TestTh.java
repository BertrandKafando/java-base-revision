package threading;

public class TestTh implements Runnable {
    public static void main(String[] args) {
        Thread t = new Thread(new TestTh());
        t.start();
    }
    
    @Override
    public void run() {
        System.out.println("Hello");
    }
}