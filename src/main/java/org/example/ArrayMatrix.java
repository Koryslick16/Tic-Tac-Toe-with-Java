package org.example;


import java.util.Scanner;

public class ArrayMatrix {
    Scanner input = new Scanner(System.in);
//    public void addMatrix(int[][] firstArr, int[][]secondArr) {

    //    }
    public void addMatrix(int[][] firstArr, int[][] secondArr) {
        int[][] newArray = new int[3][3];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = firstArr[i][j] + secondArr[i][j];
                System.out.print(newArray[i][j] + "\t");
            }
            System.out.println("");
        }

    }
    

    public void subtractMatrix(int[][] firstArr, int[][] secondArr) {
        int[][] newArray = new int[3][3];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = firstArr[i][j] - secondArr[i][j];
                System.out.print(newArray[i][j] + "\t");
            }
            System.out.println("");
        }

    }

    public void multiplyMatrix(int[][] firstArr, int[][] secondArr) {
        int[][] newArray = new int[3][3];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = firstArr[i][j] * secondArr[i][j];
                System.out.print(newArray[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public void asterisk() {
        int[] rows = new int[7];
        for (int i = 0; i <= rows.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
//            for (int j = 0; j < i; j++){
//                System.out.println("* ");
//            }
            System.out.println(" ");
        }
    }

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


