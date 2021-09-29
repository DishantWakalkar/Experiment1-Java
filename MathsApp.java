import java.util.Scanner;

class MathsApp {
    public static void main(String[] args)
    {
        int i, r, temp, fact = 1, sum=0, m=0, n=0, n1=0, n2=1, n3;
        boolean quit=false;

        System.out.println("Enter the number: ");  /*Input of number*/
        Scanner in = new Scanner(System.in);  
        int num = in.nextInt();

    /* Menu of options */
        do {
            System.out.println("Enter 1.Factorial \n2.Armstrong \n3.Palindrome \n4.Prime \n5.FibonacciSeries \n6.quit ");
            int ch = in.nextInt();

            switch (ch) {
                case 1:
                    for (i = 1; i <= num; i++) 
                    {
                        fact =  fact * i;
                    }                    
                    System.out.println("The factorial of number is :" + fact);
                    break;
                case 2: 
                    int N, rem, result = 0;
                    N = num;

                    while (N != 0) 
                    {
                        rem = N % 10;
                        result += Math.pow(rem, 3);
                        N /= 10;
                    }
                    if (result == num)
                        System.out.println(num + " is an Armstrong number.");
                    else
                        System.out.println(num + " is not an Armstrong number.");
                    break;
                case 3:
                    temp = num;
                    while (num > 0) 
                    {
                        r = num % 10;                           //getting remainder
                        sum = (sum * 10) + r;
                        num = num / 10;
                    }
                    if (temp == sum)
                        System.out.println("palindrome number ");
                    else
                        System.out.println("not palindrome");
                    break;
                case 4:
                    m = num / 2;
                    if (num == 0 || num == 1) 
                    {
                        System.out.println(num + " is not prime number");
                    } 
                    else 
                    {
                        for (i = 2; i < m; i++) 
                        {
                            if (n % i == 0) 
                            {
                                n = 1;
                                break;
                            }
                            if(n==1)
                                System.out.println(num + " is not prime number");
                            else
                                System.out.println(num + " is prime number");
                        }
                    }
                    break;
                case 5: 
                    System.out.print(n1 + " " + n2);                   
                    for (i = 2; i < num; ++i) {
                        n3 = n1 + n2;
                        System.out.print(" " + n3);
                        n1 = n2;
                        n2 = n3;
                    }
                    break;

                case 6:
                    quit = true;
                    break;


                default:
                    System.out.println("Wrong Choice.");  
                    break;
            }
        }
    while(!quit);
    System.out.println("Thank You! \nRegards Dishant.");        
    }
}