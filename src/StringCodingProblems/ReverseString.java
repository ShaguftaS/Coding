package StringCodingProblems;

public class ReverseString {

    public static void main(String[] args){

        String s1 = "Shagufta Syeda";
        String s2 = reverseStringMethod(s1);
        System.out.println(s2);;


    }
    public static String reverseStringMethod(String s1){

        StringBuilder rev = new StringBuilder();

        for(int i = s1.length() - 1; i >= 0; i --){

            rev.append(s1.charAt(i));

        }
        return rev.toString();


    }

}
