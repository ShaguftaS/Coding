package ds.stack;

public class App {

    public static void main(String[] args) {
//        Stack stk = new Stack(4);
//        stk.push(20);
//        stk.push(40);
//        stk.push(60);
//        stk.push(80);
//        stk.push(100);

//        while(!stk.isEmpty()){
//            long val = stk.pop();
//            System.out.println(val);
//        }

        System.out.println(reverseString("Hello"));

    }


    public static String reverseString(String str){

        int stackSize = str.length(); //get the max stack size
        Stack stk = new Stack(stackSize); //we make the stack

       for(int j=0; j < str.length(); j++){

            char ch = str.charAt(j); //getting a char from the input string
            stk.push(ch);
        }

        String result="";
        while(!stk.isEmpty()){
            char ch = stk.pop();
            result = result + ch; //appending to the output
        }
        return result;
    }

}
