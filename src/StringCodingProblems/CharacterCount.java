package StringCodingProblems;

public class CharacterCount {

    public static void main(String[] args){

        String str = "Shagufta Syeda";

        int count = CharCount(str);
        System.out.println(count);

    }

    public static int CharCount(String str){
        if(str == null){
            return 0;
        }

        return str.length();
    }
}
