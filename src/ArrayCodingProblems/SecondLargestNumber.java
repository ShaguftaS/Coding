package ArrayCodingProblems;

public class SecondLargestNumber {

    public static void main(String[] args){

        int[] arr= {22, 44, 55, 58, 66, 2, 4, 5};
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
        }
        return secondLargest;
    }
}
