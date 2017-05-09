package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Student st1 = new Student();

        st1.setName("Farhan");
        st1.setPhone(123456789);
        st1.setEmail("abc@xyz.com");
        st1.setRollnumber(22);

        System.out.println("Name :" + st1.getName());
        System.out.println("Phone :" + st1.getPhone());
        System.out.println("Email :" + st1.getEmail());
        System.out.println("Name :" + st1.getRollnumber());

    }
}
