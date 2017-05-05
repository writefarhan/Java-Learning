package com.company;

/**
 * Created by Farhan Khan on 27-Apr-17.
 */
public class subString {

    public static void main(String[] args) {

        String myDate = "2017:02:04";

        String[] newDate = myDate.split("\\:");

        System.out.println("The year is " + newDate[0]);
        System.out.println("The month is " + newDate[1]);
        System.out.println("The day is " + newDate[2]);





    }
}
