package Exception;

public class Employee {
    public void validateAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age can't be negative");
        }
        System.out.println("Age is valid"+ age);

    }

    public static void main(String[] args){
        Employee emp = new Employee();

        try{
            emp.validateAge(-56);

        }catch(IllegalArgumentException e){
            System.err.println("Error main:" + e.getMessage());
        }

    }


}
