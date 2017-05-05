package com.company;

/**
 * Created by Farhan Khan on 24-Apr-17.
 */
public class arrayAdd {

    public static void main(String[] args) {
        int array1[] = {3,5,2,1};
        int array2[] = {4,6,1,2};
        int array3[]= new int[4];


      for(int k=0; k<array1.length; k++ ) {
          array3[k] = array1[k] + array2[k];


      }
      for(int values:array3)
        System.out.println( values);
    }
}
