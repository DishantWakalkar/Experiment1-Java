import java.util.Scanner;
class BankingApp {
    private String name;
    private String accno;
    private String no;
    private String address;
    private float balance;
    private final Scanner sc = new Scanner(System.in);


    void createaccount() {

        System.out.print("Enter Your Name: ");
        name = sc.nextLine();
        System.out.print("Enter Your Account No: ");
        accno = sc.nextLine();
        System.out.print("Enter Your Contact No: ");
        no = sc.nextLine();
        System.out.print("Enter Your Address: ");
        address= sc.nextLine();
        System.out.print("Enter Your Initial Balance: ");
        balance = sc.nextFloat();


    }
    void displayaccount() {

        System.out.print("\nName: " + name);
        System.out.print("\nAccount No: " + accno);
        System.out.print("\nContact No: " + no);
        System.out.print("\nAddress: " + address);
        System.out.print("\nBalance: " + balance);


    }

    void deposit() {
        float amount;
        System.out.print("Enter the amount you want to deposit: ");
        amount = sc.nextFloat();
        balance = balance + amount;
        System.out.print("Your balance after the deposit: " + balance);
    }

    void withdrawal() {
        float amount;
        System.out.println("Enter the amount you want to withdraw: ");
        amount = sc.nextFloat();
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Your balance is less than " + amount + "\tTransaction failed...!!");
        }
    }

    void computeinterest() {
        float p, r, t;
        System.out.print("Enter the principal amount:");
        p = sc.nextFloat();
        System.out.print("Enter the rate:");
        r = sc.nextFloat();
        System.out.print("Enter the time:");
        t = sc.nextFloat();
        float interest = (p * r * t) / 100;
        System.out.print("principal amount:" + p);
        System.out.print("Rate:" + r);
    }
}