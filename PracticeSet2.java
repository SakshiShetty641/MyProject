package com.company;
import java.util.Scanner;
public class PracticeSet2 {
    public static void main (String args []) {
        //Question 1
        float a = 7/4 * 9/2; //Gives a wrong value coz all are integers
        System.out.println(a);
        float b = 7/4.0f * 9/2.0f; //converted to float to get correct values
        System.out.println(b);

        //Question 2 Encrypt a grade by adding 8 to it
        char grade = 'A';
        grade = (char) (grade + 8);
        System.out.println(grade);
        //Decrypt a garde
        grade = (char) (grade - 8);
        System.out.println(grade);

        //Compare whether a no is greater or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = sc.nextInt();
        int o = 9;
        System.out.println(o<num);

        //Find value
        int u = 10;
        int y = 7 * 49/7 + 35/7;
        System.out.println(y);








    }
}
