package Generics;

public class BoundedTypeEx<T> {

    public boolean areEqual(T value1, T value2){
        return value1 == value2;
    }

    public static void main(String[] args){

        BoundedTypeEx<Integer> comp = new BoundedTypeEx<>();
        System.out.println(comp.areEqual(10,10));

        BoundedTypeEx<String> comp1 = new BoundedTypeEx<>();
        System.out.println(comp1.areEqual("abc", "abc"));


    }


}
