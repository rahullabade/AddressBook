package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        PersonDetails person = new PersonDetails();
        person.Name("Rahul");
        person.LastName("Labade");
        person.Address("Shivaji Nagar");
        person.City("Amravati");
        person.State("Maharashtra");
        person.Zip(798456);
        person.PhoneNumber("789456");
        person.Email("123@gmail.com");
        System.out.println(person.toString());
    }
}
