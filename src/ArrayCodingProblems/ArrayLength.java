package ArrayCodingProblems;


//find array length
public class ArrayLength {

    public static void main(String args[]){

        int[] numbers = {1,2,3,4,5}; // input
        int length = arrayLength(numbers);
        System.out.println(length); // Output: 15

    }

    private static int arrayLength(int[] array) {
        int length = array.length;
        return length;

    }

}
