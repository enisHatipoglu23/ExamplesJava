package com.company;

import java.util.Locale;

public class Person {

    private String firstName;
    private String lastName;
    private int idNumber;

    Person(String firstName, String lastName, int iden){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = iden;
    }
//GETTER & SETTERS
    //ENCAPSULATION
    public void printPerson(){
        System.out.println("Name: " + firstName.toUpperCase(Locale.ROOT) + ", " + lastName.toUpperCase(Locale.ROOT) + "\nId: " + idNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
