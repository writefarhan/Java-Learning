package com.company;

public class Main {

    public static void main(String[] args) {


        int[] primeNumbers = new int[10];


        int number,k;
        k = 0;
        boolean isPrime;




            for (int i = 1; i < 100; i++) {

                isPrime = true;

                for (int j = 2; j < i; j++) {


                    if (i % j == 0) {

                        isPrime = false;

                        break;
                    }

                }

                if (isPrime) {

                    primeNumbers[k]= i;



                    k++;
                    System.out.println(i);
                    System.out.println("Prime number is " + primeNumbers[k]);
                }
            }



    }
}
