package Generics;

public class GenericClassEx {

    public <T> boolean areEqual(T value1, T value2){
        return value1 == value2;

    }

    public static void main(String[] args){

        GenericClassEx comp = new GenericClassEx();

        boolean intResult = comp.areEqual(10,10);

        System.out.println(intResult);
    }
}
