import java.util.Scanner;
class Employee
{
    int year;
    String name, address;
}   

class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many employees?");
        int n = sc.nextInt();
        Employee emp[] = new Employee[n];
        for (int i = 0; i < n; i++) 
            {
                emp[i] = new Employee();
                System.out.println("Enter " + (i + 1) + " Employee data :");
                System.out.print("Enter employee name :");
                emp[i].name = sc.next();
                System.out.print("Enter employee year of joining :");
                emp[i].year = sc.nextInt();
                System.out.print("Enter employee address :");
                emp[i].address = sc.next();
            }
    System.out.println("\n\n********* All Employee Details are :*********\n");
    for (int i = 0; i < n; i++) 
        { 
            System.out.println(" " + emp[i].name + " " + emp[i].year + " " + emp[i].address);
        }
   
    }
}                   