package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsEx {

    public static void main(String[] args){

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(50);
        nums.add(20);
        nums.add(60);
        nums.add(30);

        Collections.sort(nums);
        System.out.println(nums);

        Collections.reverse(nums);
        System.out.println(nums);

        //Search for an element in the list
        int index = Collections.binarySearch(nums,50);
        System.out.println(index);

    }

}
