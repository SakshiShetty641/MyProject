package com.company;
import java.util.Scanner;

public class RockPaperGame {
    public static void main(String [] args) {
        int rockChoice = 1;
        int paperChoice = 2;
        int scissorChoice = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Player enter your choice");
        int Player = sc.nextInt();
        System.out.println("Computer enter your choice");
        int Computer = (int) Math.floor(Math.random() * 3 + 1);
        switch(Player) {
            case 1 :
                System.out.println("Rock Chooosed");
                break;
            case 2:
                System.out.println("Paper Chooosed");
                break;
            case 3:
                System.out.println("Scissor Chooosed");
                break;
        }
        switch(Computer) {
            case 1 :
                System.out.println("Rock Chooosed");
                break;
            case 2:
                System.out.println("Paper Chooosed");
                break;
            case 3:
                System.out.println("Scissor Chooosed");
                break;
        }

        if (Player == paperChoice && Computer == rockChoice || Player == scissorChoice && Computer == paperChoice || Player == rockChoice && Computer == scissorChoice)
        {
            System.out.println("Player has won & Computer has lost the game");
        }
        else if (Computer == paperChoice && Player == rockChoice || Computer == scissorChoice && Player == paperChoice || Computer == rockChoice && Player == scissorChoice){
        System.out.println("Computer has won & Player has lost the game");
        }
        else {
            System.out.println("Game is draw");

        }



    }
}
