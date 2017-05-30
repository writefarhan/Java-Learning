package com.company;

/**
 * Created by Farhan Khan on 22-May-17.
 */
public class Student {

    int regnumber = 1000;
    String name;
    static String course = Android;



Student(String name, String course) {

    this.name = name;
    this.regnumber++;
    System.out.println(regnumber);

}

public void display() {

    System.out.println(this.name + " " + this.course + " " + regnumber);



}

}