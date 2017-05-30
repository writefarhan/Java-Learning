package com.company;

/**
 * Created by Farhan Khan on 29-May-17.
 */
public class gallon2Liter {

  public static void main(String[] args) {


      double liters,gallon;

      int counter =0;


      for(gallon=1; gallon<=100; gallon++){

          liters = gallon * 3.7854;

          System.out.println( gallon + " = " + liters + " Liters");

          counter++;

          if(counter==10){

              System.out.println("==========================");
                      counter = 0;

          }



      }



    }

}
