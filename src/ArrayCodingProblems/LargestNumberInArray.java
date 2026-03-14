package ArrayCodingProblems;

public class LargestNumberInArray {

    public static void main(String[] args){
        int[] num = {23, 11, 55, 88, 44, 77};
        int large = findLargest(num);
        System.out.println("Largest element in the array is : " +large);

    }

    public static int findLargest(int[] arr){

        int large = arr[0];

        for(int i =1; i < arr.length; i++){
            if(large < arr[i]){
                large = arr[i];
            }


        }


        return large;
    }
}
