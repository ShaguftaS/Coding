package StringCodingProblems;

public class VowelCounter {

    public static void main(String[] args){

        String input = "Shagufta Syeda";

        int num = countVowels(input);
        System.out.println(num);

    }

    public static int countVowels(String in){

        String vowels = "aeiouAEIOU";
        int count = 0;

        for(int i =0; i < in.length(); i++){

            char ch = in.charAt(i);

            if(vowels.indexOf(ch) != -1){

                count++;
            }
        }

        return count;
    }
}
