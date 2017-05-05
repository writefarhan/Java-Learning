package com.company;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by Farhan Khan on 24-Apr-17.
 */
public class multiArray {

    public static void main(String[] args) {

        int myArray[][]= new int[3][4];


        for(int i=0; i<3; i++){


           for(int j=0; j<4; j++){

               myArray[i][j] = i * j + 1;

               System.out.print(myArray[i][j] + " ");


           }

            System.out.println("");
        }


    }
}
