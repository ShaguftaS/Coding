package TypesOfClasses;

public class OuterInnerClassEx {

    private int outerField = 10;

    //Member inner class
    public class InnerClass{

        public void displayOuterField(){
            System.out.println(outerField);
        }

    }

    public static void main(String args[]){

        OuterInnerClassEx out = new OuterInnerClassEx();

        InnerClass in = out.new InnerClass();

    }

}
