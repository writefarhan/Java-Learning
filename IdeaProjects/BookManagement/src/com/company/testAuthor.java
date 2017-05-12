package com.company;

/**
 * Created by Farhan Khan on 12-May-17.
 */
public class testAuthor {

    public static void main(String[] args) {

        Author gabasons = new Author("Gaba and Sons","gaba@gmail.com",'m');

        System.out.println(gabasons);


        gabasons.setEmail("gabasons1@gmail.com");

        System.out.println(gabasons);

        System.out.println(gabasons.getName());
        System.out.println(gabasons.getEmail());
        System.out.println(gabasons.getGender());


    }
}
