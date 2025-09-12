// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Accounts {
    int acc_no;
    String acc_name;
    double balance;
    
    void setDetails(int no, String name, double bal) {
        acc_no = no;
        acc_name = name;
        balance = bal;
    }
    void withdraw(int amount){
        System.out.println(" balance withdrawl is:"+amount);
        balance -= amount;
        System.out.println("Current balance is:"+balance);
    }
    
    void displayDetails() {
        System.out.println("Name = " + acc_name);
        System.out.println("Account Id = " + acc_no);
        System.out.println("Total Balance = " + balance);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Accounts acc1 = new Accounts();
        acc1.setDetails(54, "lucky", 5000.0);
        acc1.displayDetails();
        acc1.withdraw(4000);
        acc1.displayDetails();
    }
}
