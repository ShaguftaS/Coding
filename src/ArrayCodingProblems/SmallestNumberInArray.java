package ArrayCodingProblems;

public class SmallestNumberInArray {

    public static void main(String[] args){

        int[] num = { 3, 5, 7, 2, 8, 1, 5};
        int small = smallestElement(num);
        System.out.println(small);

    }

    public static int smallestElement(int[] arr){
        int small = arr[0];
        for(int i = 1; i< arr.length; i++){

            if(small > arr[i]){
                small = arr[i];
            }

        }

        return small;
    }


}
