package LambdaExpression;

interface MyFunction1{
    void sayHello();
}

public class WithLambdaExpressionEx {

    public static void main(String[] args){

        MyFunction1 func = () -> {
            System.out.println("Hello");
        } ;

        func.sayHello();

    }
}
