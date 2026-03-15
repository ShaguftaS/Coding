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

        Arrays.fill(array, 1);
        System.out.println(Arrays.toString(array));

        array = new int[] { 5, 3, 1, 4, 2 };

        int[] newArray = Arrays.copyOf(array, 7);
        System.out.println(Arrays.toString(newArray));

    }
}
