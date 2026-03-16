package StringCodingProblems;

public class RemoveWhiteSpace {
    public static void main(String[] args){

        String s = " Shagufta   Syeda  !  ";
        String res = removeWhiteSpaces(s);
        System.out.println(res);

    }

    public static String removeWhiteSpaces(String str){

        return str.replaceAll("\\s", "");

    }
}
