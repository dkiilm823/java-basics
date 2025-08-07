import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter operator +,-,/,* : ");
        char operator = sc.next().charAt(0);
        int result = 0;
        switch (operator){
            case '+':
                result = n1+n2;
                break;
            case '-':
                result = n1-n2;
                break;
            case '/':
                result = n1/n2;
                break;
            case '*':
                result = n1*n2;
                break;
        }
        System.out.println("Result "+ result);
    }
}
