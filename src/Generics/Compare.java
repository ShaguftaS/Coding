package Generics;

public class Compare {

    public boolean areEqual(int value1, int value2){
        return value1 == value2;
    }

    public static void main(String[] args){

        Compare comp = new Compare();

        boolean intResult = comp.areEqual(10,10);

        System.out.println(intResult);
    }
}
