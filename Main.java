package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
//OOP
    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("First Name: ");
        String firstName = input.nextLine();
        System.out.println("Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Id: ");
        int id = input.nextInt();
        System.out.println("Score num: ");
        int numScores = input.nextInt();
        int[] testScores = new int[numScores];

        for (int i = 0; i < numScores; i++){
            System.out.println((i+1) + ". Score: ");
            testScores[i] = input.nextInt();
        }
        input.close();
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());

    }
}
