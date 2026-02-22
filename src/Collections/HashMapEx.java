package Collections;

import java.util.HashMap;

public class HashMapEx {

    public static void main(String[] args){

        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Happy", 33);
        marks.put("Shagufta", 34);
        marks.put("Syeda", 35);

        System.out.println(marks.get("Shagufta"));

        marks.remove("Happy");



    }
}
