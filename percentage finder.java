import java.util.Scanner;
// importing scanner tag


public class percentage {
    public static void main(String[] args) {
        //initalizing class name


        float sub1,sub2,sub3,sub4,sub5;
        // initilazing variables


        System.out.println("PERCENTAGE FINDING PROGRAM");
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter THE MARKS OUT OFF");
       float outoff= sc.nextFloat();
        // Taking input for out off



        //Taking input for all adition variables
        System.out.println("Enter the number of subject one");
        sub1= sc.nextFloat();

        System.out.println("Enter the number of subject two");
        sub2= sc.nextFloat();

        System.out.println("Enter the number of subject three");
        sub3= sc.nextFloat();

        System.out.println("Enter the number of subject four");
        sub4= sc.nextFloat();

        System.out.println("Enter the number of subject five");
        sub5= sc.nextFloat();


        //making variable scored for total of all marks scored
        float scored=sub1+sub2+sub3+sub4+sub5;
        System.out.println("the total is ::"+scored);


       // taking input for total marks
        System.out.println("Total marks");
        float total= sc.nextFloat();


        //using formulla to find percentage
        float percentage=(scored/total)*outoff;
        System.out.println(" percentage ::" +percentage);
    }

}

