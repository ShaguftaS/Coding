package Collections;

import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args){

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println(nums.get(2));

        nums.remove(2);

    }
}
