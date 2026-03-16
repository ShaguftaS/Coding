package StringCodingProblems;

public class PalindromeChecker {

    public static void main(String[] args){

        String pal = "abba";

        boolean res = isPalindrome(pal);
        System.out.println(res);


    }

    public static boolean isPalindrome(String p1){

        StringBuilder sb = new StringBuilder();


        for(int i = p1.length() - 1; i >=0; i--){

            sb.append(p1.charAt(i));
            System.out.println(sb);

        }

        if( sb.equals(p1)){
            return true;
        }
        else{
            return false;
        }


    }

}
