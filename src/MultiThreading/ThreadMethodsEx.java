package MultiThreading;

public class ThreadMethodsEx extends Thread{

    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        System.out.println("ThreadMethodsEx: "+ threadName);

    }

    public static void main(String[] args){

        ThreadMethodsEx th = new ThreadMethodsEx();

        //1. start the thread
        th.start();

        //2. Check thread status

        if(th.isAlive()){
            System.out.println("Thread is running");
        }


    }


}
