package ArrayCodingProblems;

import java.util.Arrays;

public class ArrayMethodsExample {

    public static void main(String[] args){

        int[] array = { 5, 3, 1, 4, 2 };

        // Convert array to a string representation
        String arr = Arrays.toString(array);
        System.out.println(arr);

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));



    }
}
