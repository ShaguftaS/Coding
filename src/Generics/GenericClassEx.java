package Generics;

public class GenericClassEx<T> {

    public boolean areEqual(T value1, T value2){

        return value1 == value2;

    }
    public boolean notEqual(T value1, T value2){

        return value1 != value2;

    }

    public static void main(String[] args){

        GenericClassEx<Integer> res = new GenericClassEx<>();

        boolean result = res.areEqual(10,20);
        System.out.println(result);

        boolean result2 = res.areEqual(10,10);
        System.out.println(result2);

        GenericClassEx<String> res1 = new GenericClassEx<>();

        boolean result3 = res1.areEqual("shagufta", "shagufta");
        System.out.println(result3);


    }




}
