package com.company;

/**
 * Created by Farhan Khan on 30-May-17.
 */
public class triangle {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {


            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }







    }

}
