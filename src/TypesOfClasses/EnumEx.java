package TypesOfClasses;

public class EnumEx {

    public void printActivity(Priorities priority){

        switch (priority){
            case LOW -> System.out.println("resting");
            case MEDIUM -> System.out.println("Learning");
            case HIGH -> System.out.println("Working");
            default -> System.out.println("Enjoying");
        }
    }


    public static void main(String args[]){

        Priorities now = Priorities.MEDIUM;

        EnumEx print = new EnumEx();
        print.printActivity(now);
    }

}
