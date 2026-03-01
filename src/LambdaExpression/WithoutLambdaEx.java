package LambdaExpression;

interface MyFunction{
    void sayHello();
}

class MyFunctionImpl implements MyFunction{

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}

public class WithoutLambdaEx {

    public static void main(String[] args){

        MyFunctionImpl func = new MyFunctionImpl();

        func.sayHello();


    }
}
