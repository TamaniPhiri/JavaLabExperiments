class RunnableTask implements Runnable {
    public void run() {
        for(int i = 1; i <5; i++) {
            System.out.println("Runnable is running");
        }
    }
}

class CustomThread extends Thread {
    public void run() {
        for(int i = 1; i <5; i++) {
            System.out.println("Thread is running");
        }
    }
}
public class Main{
    public static void main(String[] args){
        RunnableTask task = new RunnableTask();

        Thread thread1 = new Thread(task);
        thread1.start();
        
        CustomThread thread2 = new CustomThread();
        thread2.start();

        for (int i = 0; i <=5; i++) {
            System.out.println("Main program is running");
        }
    }
}