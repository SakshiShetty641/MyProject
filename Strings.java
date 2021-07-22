package com.company;
import java.util.Scanner;
public class Strings {
    public static void main(String args [] ){
        //String name = new String("Sakshi");
        //System.out.println("Name is :");
        //System.out.println(name);
        //System.out.print("Name is :");
        //System.out.print(name);
        int a = 10;
        float b = 7.89f;
        //System.out.printf("The value of a is %d and value of b is %f", a,b);
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the name : ");
        //String Str = sc.next();
       // System.out.println(Str);
        //System.out.println("Enter the name : ");
        //String st = sc.nextLine();
        //System.out.println(st);
        //float x = 7.345647f;
        //System.out.printf("The value os x is %9.2f", x )

       // String Method
        String firstName = "Shobha";
        int value = firstName.length();
        System.out.println(value);
        String sentence = "Welcome To The Show";
        String lstring = sentence.toLowerCase();
        System.out.println(lstring);
        String line = "show case";
        String ustring = line.toUpperCase();
        System.out.println(ustring);
        String nontrimmed = "            dia           ";
        System.out.println(nontrimmed);
        System.out.println(nontrimmed.trim());
        String message = "HelloWorld";
        System.out.println(message.substring(3,6));
        System.out.println(message.replace("World", "Globe"));
        System.out.println(message.replace("W", "Globe"));
        String d = "Tarrarrlk";
        System.out.println(d.startsWith("Ta"));
        System.out.println(d.endsWith("Ta"));
        System.out.println(d.charAt(2));
        System.out.println(d.indexOf('a'));
        System.out.println(d.indexOf('a', 4));
        String op = "sakshi";
        System.out.println(op.equalsIgnoreCase("Sakshi"));









        sc.close();






    }
}
