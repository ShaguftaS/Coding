package ds.Exercise;

public class AppExercise {

    public static void main(String[] args) {

        Exercise1 exe = new Exercise1();
        int[] a = {10,200,4,88};

        int[] res = exe.findMaxAndMin(a);

        System.out.println("Minimum value: " + res[0]);
        System.out.println("Max value: "+ res[1]);

        Exercise2 exe2 = new Exercise2();
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println(exe2.maxProfit(prices1));

        Exercise3 exe3 = new Exercise3(5);
        exe3.push(4);
        exe3.push(6);
        exe3.peek();
        exe3.display();


    }



}
