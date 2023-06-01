interface A{
    public void methodA();
}
interface B{
    public void methodB();
}
class C implements A, B {
    public void methodA(){
        System.out.println("Method A");
    }
    public void methodB(){
        System.out.println("Method B");
    }
}
public class MultipleInheritance{
    public static void main(String[] args){
        C obj= new C();
        
        obj.methodA();
        obj.methodB();
    }
}