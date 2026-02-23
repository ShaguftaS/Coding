package MultiThreading;

public class MyThread extends Thread {

    public void run(){
        System.out.println("Second thread");
    }

    public static void main(String[] args){

        MyThread th = new MyThread();

        th.start();

        System.out.println("Main Thread");

    }


}
