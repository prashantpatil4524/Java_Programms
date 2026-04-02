// Simple Multithreading Example
class MyThread extends Thread {
    public void run() {
	for(int i=1;i<=10;i++)
        System.out.println("Thread is running..."+i);
    }
}

public class Threading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // create thread
        t1.start(); // start thread'
	MyThread t2 = new MyThread(); // create thread
        t2.start(); // start thread

    }
}