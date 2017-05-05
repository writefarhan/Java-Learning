package com.company;

/**
 * Created by Farhan Khan on 25-Apr-17.
 */
public class forEach {

    public static void main(String[] args) {

        String newline[] = {"Hell", "Kya", "Horaha", "Hay"};

        newline[1] = "Ku";

        for(String values : newline) {

            System.out.println(values);



        }


    }
}
