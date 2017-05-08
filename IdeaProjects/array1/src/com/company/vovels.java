package com.company;

import java.util.Scanner;

/**
 * Created by Farhan Khan on 04-May-17.
 */
public class vovels {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.print("Enter a Character :");

        char userinput = scr.next().charAt(0);

        boolean isVovel= false;


        switch(userinput) {

            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                System.out.println("Charactor is Vovel");
                break;

            default:
                System.out.println("Charactor is not Vovel");
                break;
        }






    }

}
