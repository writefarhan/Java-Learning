package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int userinput ;

        Scanner scr = new Scanner(System.in);
        Random rnd = new Random();

do {

    System.out.println("Welcome to Guess game ");

    int answer = rnd.nextInt(20 + 1);

    System.out.println("Number is : " + answer);

    for (int i = 1; i <= 3; i++) {

        if (i>1) {
            System.out.print("Guess again : ");
        }else {
        System.out.print("Guess the number : ");}
        userinput = scr.nextInt();


        if (answer == userinput) {

            System.out.println("Right Answer! ");
            break;

        } else {


            if ( i <3 ) {
                System.out.println("Wrong Answer");
            }else {

                System.out.println("Sorry All Chances are gone");
            }

        }


    }

    System.out.println("==========================");

    System.out.println("Press 1 to play again or press any key ");
    userinput = 0;
    userinput = scr.nextInt();

}while (userinput == 1);
    }
}
