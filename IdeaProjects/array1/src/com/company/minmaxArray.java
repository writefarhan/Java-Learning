package com.company;

/**
 * Created by Farhan Khan on 24-Apr-17.
 */
public class minmaxArray {

    public static void main(String[] args) {

        int arr1[] = {74,4,54,6,3,23};

        int temp;


         int maxvalue, minvalue;

         maxvalue = arr1[0];
        minvalue = arr1[0];


            for(int i=1; i < arr1.length; i++) {

                if (maxvalue < arr1[i]) {

                    maxvalue = arr1[i];

                //    System.out.println("Swaped " + arr1[j-1] + " " + arr1[j]);
                }

            }


        for(int j=1; j < arr1.length; j++) {

            if (minvalue > arr1[j]) {

                minvalue = arr1[j];

                //    System.out.println("Swaped " + arr1[j-1] + " " + arr1[j]);
            }

        }




        System.out.println(maxvalue +" "+ minvalue);




    }
}
