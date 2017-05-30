package com.company;

/**
 * Created by Farhan Khan on 12-May-17.
 */
public class testBook {

    public static void main(String[] args) {

        Author headefirst = new Author("Heade First","headefist@gmail.com",'m');


        // Test Book's constructor and toString()
        Book book1 = new Book("Head First Java 2nd Ed",headefirst,14.5,1000);

        System.out.println(book1);

        book1.setPrice(9.99);
        book1.setQty(100);

        System.out.println("Book Name: " + book1.getName());
        System.out.println("Book Price: " + book1.getPrice());
        System.out.println("Book Quantity: " + book1.getQty());
        System.out.println("Author is: " + book1.getAuthor()) ; // invoke Author's toString()
        System.out.println("Author Name: " + book1.getAuthor().getName()) ;
        System.out.println("Author Email: " + book1.getAuthor().getEmail()) ;
        System.out.println("Author Gender : " + book1.getAuthor().getGender()) ;



        Book book2 = new Book("Java for dummies",  new Author("Orilly","orilly@gmail.com",'f'), 19.5, 2000 );


        System.out.println(book2);




    }
}
