package org.example;


import java.util.Scanner;

public class ArrayMatrix {
    Scanner input = new Scanner(System.in);

    int[][] myArr = {
            {3, 1, 6},
            {2, 4, 10},
            {5, 12, 9}
    };


    int[][] secondArr = {
            {8, 7, 6},
            {13, 20, 9},
            {11, 7, 5}
    };

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



}


