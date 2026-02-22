package Collections;

import java.util.HashSet;

public class HashSetEx {

    public static void main(String[] args){

        HashSet<Integer> hash = new HashSet<>();

        hash.add(10);
        hash.add(20);
        hash.add(30);
        hash.add(20); //duplicate not allowed

        System.out.println(hash);

        hash.remove(30);

        System.out.println(hash);
    }
}
