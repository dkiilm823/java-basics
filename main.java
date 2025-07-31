import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();
        System.out.println("n1 + n2 = " + (n1 + n2));
        System.out.println("n1 - n2 = " + (n1 - n2));
        System.out.println("n1 * n2 = " + (n1 * n2));
        System.out.println("n1 / n2 = " + (n1 / n2));
    }
}
