package com.company;

/**
 * Created by Farhan Khan on 25-Apr-17.
 */
public class stringMethods {

    public static void main(String[] args) {


        String myLine = "A Quick Brown Fox Jump Over a Lazy Dog.";
        String str1 = "Pakistan ";
        String str2 = "Zindabad";



        String str3 = "My Name is ".concat("Farhan");

        System.out.println("str3:"+str3);
        System.out.println("Hello," + " world" + "!");



        int stringLenght = myLine.length();


        System.out.println("String Length is  " + stringLenght);
        System.out.println(str1.concat(str2));

        System.out.println("CharAt 22 " + myLine.charAt(21));

        System.out.println("indexOf a " + str1.indexOf("a"));
        System.out.println("indexOf a " + str1.lastIndexOf("a"));

        System.out.println(myLine.replace("Fox","Dog"));



        String strVar = "A,B,,,C";
        String[] items = strVar.split(",");

        for(String strvalues : items){

            System.out.println(strvalues);
        }

        System.out.println("Length of array is "+ items.length);


        String strVar2 = "A.B.C";
        String[] items2 = strVar2.split("\\.");

        for(String strvalues2 : items2){

            System.out.println(strvalues2);
        }

        System.out.println("Length of array is "+ items2.length);



        String strVar3 = "A|B|C";
        String[] items3 = strVar3.split("\\|");

        for(String strvalues3 : items3){

            System.out.println(strvalues3);
        }

        System.out.println("Length of array is "+ items3.length);

    }

}
