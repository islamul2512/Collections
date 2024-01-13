package MultiThreading;
class myThread2 implements Runnable{
    public void run() {

        while (true){
            System.out.println("Inside the 2nd Thread ");
        }

    }
}
class MyThread extends Thread{
    public void run(){
        while(1>0){
            System.out.println("Inside my thread : ");
            try {
                System.out.println("The thred will sleep for 7 seconds now");
                Thread.sleep(7000);
                System.out.println("Thread woke up");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
                System.out.println(" Thread 1 doing its tasks");
        }
    }
}
public class Threading {
    public static void main(String[] args) {
        Thread thread2 = new Thread(new myThread2());
        thread2.start();

        MyThread t= new MyThread();
        t.start();
        while(true){
            System.out.println("main Thread Inside the main method ");
        }
    }

}
