import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Division");
        System.out.println("Enter 4 for Multiplication");
        System.out.print("Enter the operator number: ");
        int op = sc.nextInt();
        if(op == 1){
            System.out.println(n1+ "+" +n2 +"="  + (n1 + n2));
        }else if(op == 2){
            System.out.println(n1+ "-" +n2+ "=" + (n1 - n2));
        }else if(op == 3){
            System.out.println(n1+ "/" +n2 +"=" + (n1 / n2));
        }else{
            System.out.println(n1+ "*" +n2 +"=" + (n1 * n2));
        }
    }
}
