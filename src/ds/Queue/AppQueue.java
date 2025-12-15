package ds.Queue;

public class AppQueue {

    public static void main(String[] args) {

        Queue myQ = new Queue(5);
        myQ.insert(100);
        myQ.insert(1000);
        myQ.insert(14);
        myQ.insert(12);
        myQ.insert(44);
        myQ.insert(444);
        myQ.insert(33);
        myQ.view();

    }
}
