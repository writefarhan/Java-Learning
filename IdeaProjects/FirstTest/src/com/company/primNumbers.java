package com.company;

/**
 * Created by Farhan Khan on 30-May-17.
 */
import java.util.Scanner;

public class primNumbers {

    public static void main(String[] args) {

        int temp;
        boolean isPrime;

    for(int i=2; i<=100; i++) {

       isPrime=true;

        for(int j=2;j<=i/2;j++)
        {



            if(i%j==0)
            {


                isPrime=false;
                break;
            }
        }

        //If isPrime is true then the number is prime else not
        if (isPrime)
            System.out.println(i + " is Prime Number");


    }

    }

}