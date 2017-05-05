package com.company;

/**
 * Created by Farhan Khan on 19-Apr-17.
 */
public class sortArray {


    public static void main(String[] args) {


        int[] myArray = {45,32,664,31,6,86,98};


        int temp;


        for(int i = 0; i< myArray.length; i++ ){


            for(int j=1; j< myArray.length; j++){


                if ( myArray[j-1] > myArray[j]){

                    temp = myArray[j-1];

                    myArray[j-1] = myArray[j];

                    myArray[j] = temp;

                    System.out.println("Change " + temp );

                }


            }

        }


        for(int k=0; k < myArray.length; k++) {


            System.out.println(myArray[k]);

        }


    }


}
