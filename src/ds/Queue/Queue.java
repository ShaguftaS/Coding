package ds.Queue;

public class Queue {

    private int maxSize; // Initialises the set number of slots
    private long[] queArray; // slots to maintain the data
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size){
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0; //index position of the first slot of array
        rear = -1; //there is no item in the array yet to be considered as the last time
        nItems = 0;
    }
    public void insert(long j){
        rear++;
        queArray[rear] = j;
        nItems++;
    }

    public void view(){
        System.out.println("[ ");
        for(int i =0; i < queArray.length; i++){
            System.out.println(queArray[i]);
        }
        System.out.println("]");
    }
}
