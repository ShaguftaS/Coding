package TypesOfClasses;

public class StaticMethodEx {

    public static int square(int num){
        return num * num ;
    }


    public static void main(String args[]){

        int result = StaticMethodEx.square(5);
        System.out.println(result);


    }
}
