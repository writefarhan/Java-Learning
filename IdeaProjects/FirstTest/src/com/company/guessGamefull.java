package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Farhan Khan on 30-May-17.
 */


public class guessGamefull {

    public static void main(String[] args) {

        boolean playagain = false;

        Scanner scr = new Scanner(System.in);
        Random rnd = new Random();


  do {
      int number = rnd.nextInt(100);
      System.out.println(number);

      for (int i = 1; i <= 3; i++) {
          System.out.print("Guess The Number :  ");
          int userinupt = scr.nextInt();

          if (userinupt == number) {

              System.out.println("Your Answer is right");

              System.out.print("Press c to continue or any key to exit ");
              char cont = scr.next().charAt(0);

              if(cont=='c'){
                  playagain = true; }
                  else {
                  playagain = false;
              }
              break;

          } else {

              if (i != 3) {
                  System.out.println("Sorry Wrong Answer Try Again Please ");
              } else {

                  System.out.print("Game Over : Press c to continue or any key to exit ");
                  char cont = scr.next().charAt(0);

                  if(cont=='c')
                      playagain = true;



              }
          }
      }
  }while (playagain);
    }
}