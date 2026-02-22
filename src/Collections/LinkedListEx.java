package Collections;

import java.util.LinkedList;

public class LinkedListEx {

    public static void main(String[] args){

        LinkedList<Integer> nums = new LinkedList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);

        System.out.println(nums.get(2));
        nums.remove(2);

    }
}
