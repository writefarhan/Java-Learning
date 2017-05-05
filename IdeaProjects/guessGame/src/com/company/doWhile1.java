package com.company;

/**
 * Created by Farhan Khan on 13-Apr-17.
 */
public class doWhile1 {

    public static void main(String[] args) {

   /* int i = 2;

        do {

            System.out.println("Count is :" + i);

                    i+=2;




        } while(i<=20);*/


        int j=1;
        int sum = 0;
        int test;

        test = sum += j++;
        System.out.println(test);

        for(j = 1; j <= 5; sum += j++) ;
        System.out.println("Sum is " + sum);

    }


}
