package MultiThreading;

public class ThreadMethodsEx extends Thread{

    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();
        System.out.println("ThreadMethodsEx: "+ threadName);

    }

    public static void main(String[] args){

        ThreadMethodsEx thread = new ThreadMethodsEx();

        //1. start the thread
        thread.start();

        //2. Check thread status

        if(thread.isAlive()){
            System.out.println("Thread is running");
        }

        //3. Get thread state: NEW/RUNNABLE/BLOCKED/ WAITING/ TERMINATED
        Thread.State state = thread.getState();
        System.out.println(state);


    }


}
