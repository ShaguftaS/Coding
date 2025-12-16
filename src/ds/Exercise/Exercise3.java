package ds.Exercise;

public class Exercise3 {

    int length = 0;
    int[] stk;
    int top;

    // Constructor to initialize stack
    public Exercise3(int capacity) {

        this.length = capacity;
        this.stk = new int[length];
        this.top = -1;

    }

    // Push element to stack
    public void push(int x) {

        if(top == length -1){
            return;
        }

        stk[++top] = x;

    }

    // Pop element from stack
    public int pop() {

        if(isEmpty()){
            return -1;
        }else{
            return stk[top--];

        }

    }

    // Peek at top element
    public int peek() {

        if(isEmpty()){

            return -1;
        }

        return stk[top];

    }

    // Check if stack is empty
    public boolean isEmpty() {

        return (top == -1);

    }

    // Get size of stack
    public int size() {

        return top + 1;

    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        // Print only valid stack elements (LIFO order)
        for (int i = top; i >= 0; i--) {
            System.out.println(stk[i]);
        }
    }
}
