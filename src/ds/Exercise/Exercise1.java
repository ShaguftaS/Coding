package ds.Exercise;

public class Exercise1 {
    public int[] findMaxAndMin(int[] numbers) {

        if(numbers == null || numbers.length == 0){
            return new  int[]{0,0};
        }

        int min = numbers[0];
        int max = numbers[0];

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return new int[]{min,max};
    }

}
