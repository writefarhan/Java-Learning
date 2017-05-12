package com.company;

/**
 * Created by Farhan Khan on 12-May-17.
 */
public class Author {


    // The private instance variables
    private String name;
    private String email;
    private char gender;

    // The constructor
    public Author(String name, String email, char gender) {

        this.name = name;
        this.email = email;
        this.gender = gender;


    }


    public void setEmail(String email){

        this.email = email;

    }

    public void setGender (char gender){

        this.gender = gender;

    }


    public String getName(){

        return name;

    }

    public String getEmail() {

        return email;

    }

    public char getGender(){

        return gender;

    }

    public String toString(){


        return "Name: " + name + ", Gender: " +  gender + ", Email: " + email;

    }



}
