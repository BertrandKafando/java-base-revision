package threading;

public class TestThread  extends Thread{
    public static void main(String[] args) {
        // create a new thread
        TestThread testThread = new TestThread();
        //  start the thread. The run() method will be executed
        testThread.start();
        // we can also put some code here to be executed by the main thread
    }

    @Override
    public void run() {
        System.out.println("Thread");
    }
}
