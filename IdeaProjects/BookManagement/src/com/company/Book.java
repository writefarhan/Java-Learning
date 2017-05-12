package com.company;

/**
 * Created by Farhan Khan on 12-May-17.
 */
public class Book {

    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name,Author author,double price, int qty){

        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;

    }



    public void setPrice(double price){

        this.price = price;

    }

    public void setQty( int qty){


        this.qty= qty;

    }

    public String getName() {

        return name;

    }

    public double getPrice(){

        return price;

    }

    public int getQty() {

        return qty;

    }

    public Author getAuthor(){

        return author;   // return member author, which is an instance of the class Author

    }

    public String toString(){


        return "Book Name: " + name + " , Price: " +  price + " , Quantity: " + qty + " , Author  : " + author;


    }

}
