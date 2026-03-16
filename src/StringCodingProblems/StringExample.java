package StringCodingProblems;

public class StringExample {
    public static void main(String[] args){

        String s1 = "Shagufta";
        String s2 = "Syeda";
        String s3 = "Shagufta Syeda";


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

        //Equals
        boolean isEqual = s1.equals(s2);
        System.out.println(isEqual);

        // Returns the char value at specified index
        char ch = s1.charAt(4);
        System.out.println(ch);

        //Removes leading and trailing whitespaces
        String trim = s1.trim();
        System.out.println(trim);

        // Replaces occurrences of specified target
        String repl = res.replace("Syeda" , "adeys");
        System.out.println(repl);

        // Splits the string into an array of substrings
        String[] part = s3.trim().split(" ");
        for(String i : part){

            System.out.println(i.trim());

        }

        // Converts the string into a char array
        char[] cha = s3.toCharArray();
        for(char c : cha){
            System.out.println(c);
        }


    }



}
