package ArrayCodingProblems;

public class SmallestNumberInArray {

    public static void main(String[] args){

        int[] num = {3, 5, 7, 2, 8};
        int small = smallestElement(num);
        System.out.println(small);

    }

    public static int smallestElement(int[] arr){
        int small =0;
        for(int i = 0; i< arr.length; i++){

            if(arr[i+1] < arr[i]){
                small = arr[i+1];
            }

            else{
                i++;
            }

        }


        return small;
    }


}
