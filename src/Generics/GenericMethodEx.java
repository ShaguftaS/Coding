package Generics;

public class GenericMethodEx {
    public <T> boolean areEqual(T value1, T value2){
        return value1 == value2;

    }

    public static void main(String[] args){

        GenericMethodEx comp = new GenericMethodEx();

        boolean intResult = comp.areEqual(10,10);

        System.out.println(intResult);


        boolean intResult2 = comp.areEqual("ab","ab");

        System.out.println(intResult2);
    }
}
