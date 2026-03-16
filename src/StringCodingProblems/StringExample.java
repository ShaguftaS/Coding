package StringCodingProblems;

public class StringExample {
    public static void main(String[] args){

        String s1 = "Shagufta";
        String s2 = "Syeda";


        // String length
        int l1 = s1.length();
        int l2 = s2.length();
        System.out.println("Length of s1 " + l1 + " Length of s2 " + l2);

        //Concatenation
        String res = s1.concat(", " + s2);
        System.out.println(res);

        //SubString -- Retrieves substring from index 5 to 9
        String sub = res.substring(5, 9);
        System.out.println(sub);

        //IndexOf
        int index = s1.indexOf('S');
        System.out.println(index);

    }



}
