package StringCodingProblems;

public class PalindromeChecker {

    public static void main(String[] args){

        String pal = "abba";

        boolean res = isPalindrome(pal);
        System.out.println(res);


    }

    public static boolean isPalindrome(String p1){

        if(p1 == null){
            return false;
        }
        StringBuilder sb = new StringBuilder();

        for(int i = p1.length() - 1; i >=0; i--){

            sb.append(p1.charAt(i));

        }

        if( p1.equals(sb.toString())){
            return true;
        }
        else{
            return false;
        }


    }

}
