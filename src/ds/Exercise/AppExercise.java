package ds.Exercise;

public class AppExercise {

    public static void main(String[] args) {

        Exercise1 exe = new Exercise1();
        int[] a = {10,200,4,88};

        int[] res = exe.findMaxAndMin(a);

        System.out.println("Minimum value: " + res[0]);
        System.out.println("Max value: "+ res[1]);

    }



}
