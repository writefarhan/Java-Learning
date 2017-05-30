package com.company;

import java.util.Scanner;

/**
 * Created by Farhan Khan on 29-May-17.
 */



public class numberGame1 {

    public static void main(String[] args) {

        int answer = 33;
        String answertype;

        Scanner scr = new Scanner(System.in);

        System.out.print("Enter your number :" );
        int userinput = scr.nextInt();

 answertype = (userinput > answer) ? "Greater" : "Lesser";

        System.out.println("Your Asnwer is " + answertype);


    /*    if(userinput > answer) {

            System.out.println("Your answer is greater then answers ");}

            else{


                System.out.println("Your Answer is Lower");
            }

*/

        }


    }


