package com.company;
import java.util.Scanner;

public class PracticeSet {
       //Question 1 - find percentage of marks
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total marks of subjects");
	    float total = sc.nextFloat();
        System.out.println("Enter the Marks of five subjects");
        float S1 = sc.nextFloat();
        float S2 = sc.nextFloat();
        float S3 = sc.nextFloat();
        float S4= sc.nextFloat();
        float S5 = sc.nextFloat();
        float sum = (float) (S1 + S2 + S3 + S4 + S5);
        float percentage  = (float) ((sum/total) * 100);
        System.out.println("The percentage is " +percentage);

        //Question 2 - Sum of three numbers
        System.out.println("Enter the three numbers");
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();
        int add = N1 + N2 + N3;
        System.out.println("The sum of three numbers is:" +add);

        //Question 3 - CGPA of 3 subjects marks out of 100
        System.out.println("Enter marks of three numbers");
        float Subject1 = sc.nextFloat();
        float Subject2 = sc.nextFloat();
        float Subject3 = sc.nextFloat();
        float cgpa = (Subject1 + Subject2 + Subject3)/30;
        System.out.println("Marks is :" +cgpa);

        //Question 4 - Take user input and print result
        System.out.println("What is your name?");
        String str = sc.next();
        System.out.println("Hello," + str +  " Have a good day");

        //Question 5 - To check whether user has entered integer or not
        System.out.println("Enter a number");
        boolean number = sc.hasNextInt();
        System.out.println(number);

        //Question 6 - To convert km to miles
        System.out.println("Enter a km to convert to miles");
        float km = sc.nextFloat();
        float convert = km * (0.62137f);
        System.out.println("The distance in miles  is :" +convert);




    }
}
