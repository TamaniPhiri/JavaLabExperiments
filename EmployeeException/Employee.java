public class Employee{
    public static void validate(int age, String employeeName){
        if(age>50){
            throw new ArithmeticException("employee age is greater than 50");
        }
        else if(employeeName.equals("")){
            System.out.println("Name of employee must be a string");
        }
        else{
            try {
                Integer.parseInt(employeeName);
                throw new IllegalArgumentException("Name should not be a number");
            } catch (NumberFormatException e) {
                System.out.println("Employee is below 50");
            }
        }
    }
    public static void main(String[] args){
        validate(19, "Taman");
    }
}