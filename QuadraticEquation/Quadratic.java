import java.util.Scanner;

public class Quadratic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the roots of the quadratic equation i.e a,b and c");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        
        double discriminant=b*b-4*a*c;
        if(discriminant>0){
            double root1=(-b+Math.sqrt(discriminant)/2*a);
            double root2=(-b-Math.sqrt(discriminant)/2*a);
            System.out.println("Roots are real and different");
            System.out.println("Root 1 :"+root1);
            System.out.println("Root 2 :"+root2);
        }
        else if (discriminant==0){
            double root=-b/(2*a);
            System.out.println("Roots are equal and same");
            System.out.println("Root :"+root);
        }
        else{
            double realPart= Math.sqrt(-discriminant)/(2*a);
            System.out.println("Roots imaginary and different");
            System.out.println("Root :"+realPart);
        }
    }
}