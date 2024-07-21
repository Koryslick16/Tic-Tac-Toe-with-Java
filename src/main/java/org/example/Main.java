package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> playerpos = new ArrayList<Integer>();
        ArrayList<Integer> player2pos = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        int[][] myArr = new int[3][3];
        myArr[0][0] = 3;
        myArr[0][1] = 1;
        myArr[0][2] = 6;
        myArr[1][0] = 2;
        myArr[1][1] = 4;
        myArr[1][2] = 10;
        myArr[2][0] = 5;
        myArr[2][1] = 12;
        myArr[2][2] = 9;

        int[][] secondArr = new int[3][3];
        secondArr[0][0] = 8;
        secondArr[0][1] = 7;
        secondArr[0][2] = 6;
        secondArr[1][0] = 13;
        secondArr[1][1] = 20;
        secondArr[1][2] = 9;
        secondArr[2][0] = 11;
        secondArr[2][1] = 7;
        secondArr[2][2] = 5;


        ArrayMatrix matrix = new ArrayMatrix();
//        matrix.addMatrix(myArr, secondArr);
//        matrix.subtractMatrix(myArr, secondArr);
//        matrix.multiplyMatrix(myArr, secondArr);
//        matrix.asterisk();
//         String name = matrix.stuName();
//         int [] scores = matrix.students();
//         matrix.theScores(name, scores);

        TicTacToe tictacGame = new TicTacToe();

        char [][] tictacBoard = {
                {' ', ' ', '|', ' ', ' ', '|', ' ', ' '},
                {'-', '-', '+', '-', '-', '+', '-', '-'},
                {' ', ' ', '|', ' ', ' ', '|', ' ', ' '},
                {'-', '-', '+', '-', '-', '+', '-', '-'},
                {' ', ' ', '|', ' ', ' ', '|', ' ', ' '}
        };


        TicTacToe.ticBoard(tictacBoard);
       while(true){
           System.out.println("Enter the position you wish to play in (1-9): ");
           int position = input.nextInt();
//           int position2;
           while(playerpos.contains(position) || player2pos.contains(playerpos)){
               System.out.println("Someone already played there");
               position = input.nextInt();
           }
           Random random = new Random();
           int position2 = random.nextInt(9) + 1;
           while(playerpos.contains(position2) || player2pos.contains(player2pos)){
               System.out.println("Someone already played there");
               position2 = random.nextInt(9) + 1;
           }
           tictacGame.inputValue(tictacBoard, position, "Player");
           String Winner = tictacGame.checkWinner();
           if(Winner.length() > 0) {
               System.out.println(Winner);
               break;
           }

           tictacGame.inputValue(tictacBoard, position2, "Player2");
           tictacGame.ticBoard(tictacBoard);
          Winner = tictacGame.checkWinner();
          if(Winner.length() > 0) {
              TicTacToe.ticBoard(tictacBoard);
              System.out.println(Winner);
              break;
          }
           System.out.println(Winner);
       }

    }
}