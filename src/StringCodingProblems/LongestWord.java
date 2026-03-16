package StringCodingProblems;

public class LongestWord {

    public static void main(String[] args){

        String s = "Interviews are the best";
        String longestWord = LongWord(s);
        System.out.println(longestWord);

    }
    public static String LongWord(String s){

        if(s == null || s.isEmpty()){
            return "";
        }

        String longword = "";
        String[] words = s.split(" ");

        for(String word : words){

            if(word.length() > longword.length()){
                longword = word;
            }
        }
        return longword;

    }


}
