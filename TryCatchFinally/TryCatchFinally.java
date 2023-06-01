public class TryCatchFinally{
    public static void main(String[] args){
        int x=10,y=0;
        try {
            int result=x/y;
            System.out.println("Result :"+result);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception :"+e.getMessage());
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}