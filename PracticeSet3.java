package com.company;

public class PracticeSet3 {
    public static void main(String args[]) {
      //To lower case
        String name1 = "SAKSHI SHETTY";
        name1 = name1.toLowerCase();
        System.out.println(name1);

     //Replace space with underscore
     String name2 = "  Dia";
     name2 = name2.replace(" ", "_");
        System.out.println(name2);

      //

      //Detect double and triple space name
      String line = "Hello forks!   Welcome   to group";
        System.out.println(line.indexOf("  "));
        System.out.println(line.indexOf("    "));

       //Escape sequemce
       String line3 = "Hello,\n \t This course is good";
        System.out.println(line3);




    }
}
