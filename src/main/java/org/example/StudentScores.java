package org.example;

import java.util.Scanner;

public class StudentScores {
    Scanner input = new Scanner(System.in);

    public String stuName() {
        input = new Scanner(System.in);
        System.out.println("Input the student's name");
        return input.next();
    }

    public int[] students() {
        input = new Scanner(System.in);
        int[] subjects = new int[4];
        System.out.println("Input the Math, Physics, Chemistry, and Biology scores respectively:");
        for (int i = 0; i < subjects.length; i++) {

            System.out.println("Course " + (i + 1) + ": ");

            subjects[i] = input.nextInt();

        }
        return subjects;
    }


    public void theScores(String name, int[] scores) {
        System.out.println("\t*************************");
        System.out.println(name + "'s scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Math: " + scores[i]);
            System.out.println("Physics: " + scores[i + 1]);
            System.out.println("Chemistry: " + scores[i + 2]);
            System.out.println("Biology: " + scores[i + 3]);

        }
    }

}
