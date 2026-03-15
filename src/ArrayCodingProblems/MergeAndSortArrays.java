package ArrayCodingProblems;

import java.util.Arrays;

public class MergeAndSortArrays {

    public static void main(String[] args){

        int[] arr1 = { 5, 3, 1, 2, 4 };
        int[] arr2 = { 9, 7, 10, 8, 6 };

        int[] arr3 = MergeSort(arr1, arr2);

        System.out.println(Arrays.toString(arr3));

    }

    public static int[] MergeSort(int[] arr1, int[] arr2){

        int l1 = arr1.length;
        int l2 = arr2.length;
        int l3 = l1 + l2 ;
        int[] arr3 = new int[l3];

        for(int i = 0; i < l1; i++){
            arr3[i] = arr1[i];

        }
        for(int i = 0; i < l2; i++){
            arr3[l1 + i] = arr2[i];
        }

        Arrays.sort(arr3);

        return arr3;
    }


}
