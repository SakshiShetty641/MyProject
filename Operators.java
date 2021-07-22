package com.company;

public class Operators {
    public static void main(String args[]) {
        int b = 9;
        b += 3;
        System.out.println(67>=6);
        System.out.println(89>5 && 78>80);
        System.out.println(45>6 || 6>7);
        System.out.println(2&3);
        System.out.println(b);

        //Precedence and Associativity
        int x = 90/5 + 8*9;
        System.out.println(x);
        int d = 5*6 + 40/7;
        System.out.println(d);
        //associativity of * & / is left to right
        int g = 5;
        int f = 7;
        int h = 2;
        int t = (g*g - 4*f*h)/(2*f);
        System.out.println(t);

        //Increment & Decrement operator
        int i = 56;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        int k = 10;
        System.out.println(--k);
        System.out.println(k);
        System.out.println(k--);
        System.out.println(k);










    }
}