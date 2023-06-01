class UserException extends Exception {
    public UserException(String message) {
        super(message);
    } 
}
public class UserDefinedException{
    public static void main(String[] args){
        try {
            int age = 15;
            if(age <18){
                throw new UserException("Age must be greater than 18");
            }
            System.out.println("You are eligible");
        }catch(UserException ex) {
            System.out.println("Exception :"+ ex.getMessage());
        }
    }
}