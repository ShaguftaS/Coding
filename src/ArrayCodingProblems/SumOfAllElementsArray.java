package ArrayCodingProblems;

public class SumOfAllElementsArray {

    public static void main(String[] args){

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = arraySummation(num);
        System.out.println(sum);

    }

    private static int arraySummation(int[] num) {
        int sum = 0;
        for( int i : num){

            sum += i;

        }
        return sum ;

    }


}
