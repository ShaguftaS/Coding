package ArrayCodingProblems;

public class SecondLargestNumber {

    public static void main(String[] args){

        int[] arr= {10, 7, 23, 45, 8};
        int secLarg = findSecondLargest(arr);
        System.out.println("Second largest element in array is:  "+secLarg);
    }

    public static int findSecondLargest(int[] num){
        int largest = 0;
        int secondLargest = 0;

        for(int i = 0; i< num.length; i++){
         if(largest < num[i]){
             secondLargest = largest;
             largest = num[i];
         }
         // Complex case: {10, 7, 23, 45, 30} last if loop will not execute
            else if( num[i] > secondLargest && num[i] != largest){
                secondLargest = num[i];
         }

        }
        return secondLargest;
    }
}
