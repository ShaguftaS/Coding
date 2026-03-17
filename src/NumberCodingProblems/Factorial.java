package NumberCodingProblems;

public class Factorial {

    public static void main(String[] args){

        int no = 5;
        long fact = calFactorial(no);
        System.out.println( "Factorial of the number: " +no+ " is  "+ fact);

    }
    public static long calFactorial(int no){

        if(no == 0){
            return 1;
        }

        long res = 1;
        for(int i = 1; i<= no; i++){

            res *= i;

        }
        return res;
    }
}
