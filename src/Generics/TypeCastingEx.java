package Generics;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingEx {

    public static void main(String[] args){

        List list = new ArrayList();
        list.add("Hello");

        String str = (String) list.get(0);

        List<String> li = new ArrayList<>();
        li.add("Hello");
        String str1 = li.get(0);

    }
}
