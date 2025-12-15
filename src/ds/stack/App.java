package ds.stack;

public class App {

    public static void main(String[] args) {
        Stack stk = new Stack(4);
        stk.push(20);
        stk.push(40);
        stk.push(60);
        stk.push(80);
        stk.push(100);

        while(!stk.isEmpty()){
            long val = stk.pop();
            System.out.println(val);
        }

    }
}
