import java.util.Scanner;

//importing input extension to take input

public class Name {
    public static void main(String[] args) {
        System.out.println("taking import from the user");
        Scanner sc= new Scanner(System.in);

        // 1>this used in taking input from system
        /* 2>(scanner) is used as input command to take input values from user
           3>(system.in) is used as the input is taking from the system */

        System.out.println("enter the first number");
        int a= sc.nextInt();

        // 4> taking input value of integer

        System.out.println("enter the second number");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println("the sum is");
        System.out.println(sum);
    } // 5> applying thr formulla of sum .
}


