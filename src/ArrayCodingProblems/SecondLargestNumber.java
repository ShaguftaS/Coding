package ArrayCodingProblems;

public class SecondLargestNumber {

    public static void main(String[] args){

        int[] arr= {22, 44, 55, 58, 66, 2, 4, 5};
        int secLarg = findSecondLargest(arr);
        System.out.println(secLarg);
    }

    public static int findSecondLargest(int[] num){
        int larg = num[0];
        int sec = 0;

        for(int i = 1; i< num.length; i++){
         if(larg < num[i]){
             sec = larg;
             larg = num[i];
         }

        }

        return sec;
    }
}
