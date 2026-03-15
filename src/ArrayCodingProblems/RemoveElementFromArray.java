package ArrayCodingProblems;

import java.util.Arrays;

public class RemoveElementFromArray {

    public static void main(String[] args){

        int[] arr = { 1, 2, 3, 4, 5, 3, 6};
        int elementToRemove = 3;

        int[] newArray = removeElement(arr, elementToRemove);
        System.out.println(Arrays.toString(newArray));

    }

    private static int[] removeElement(int[] arr, int elementToRemove) {

        int count = 0;

        for(int item : arr){
            if(item == elementToRemove){
                count++;
            }

        }

        int[] newArray = new int[arr.length - count];
        int index = 0;

        for(int item : arr){
            if(item != elementToRemove){
                newArray[index++] = item;
            }
        }

        return newArray;



    }
}
