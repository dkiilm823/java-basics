import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();
        double d = (b*b)-(4*a*c);
        if(d>0){
            double root1 = (-b+Math.sqrt(d))/(2*a);
            double root2 = (-b+Math.sqrt(d))/(2*a);
            System.out.println("Two roots are: "+root1+","+root2);
        }else if(d==0){
            double root = (-b)/(2*a);
            System.out.println("Root is: "+root);
        }else{
            System.out.println("No real root exists");
        }
        sc.close();
    }
}
