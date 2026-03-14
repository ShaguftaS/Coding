package ArrayCodingProblems;

public class AverageOfArray {

    public static void main(String[] args){

        int[] num = {1, 2, 3, 4, 5 };
        float avg = findAverage(num);
        System.out.println("Average is: " + avg);

    }
    public static float findAverage(int[] arr){

        float sum = 0, avg = 0;
        int len = arr.length;
        for (int i : arr){
            sum += i;
        }

        avg = sum / len ;


        return avg;
    }


}
