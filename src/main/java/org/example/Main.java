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

        char [][] tictacBoard = {
                {' ', ' ', '|', ' ', '|', ' ', ' '},
                {'-', '-', '+', '-', '+', '-', '-'},
                {' ', ' ', '|', ' ', '|', ' ', ' '},
                {'-', '-', '+', '-', '+', '-', '-'},
                {' ', ' ', '|',  ' ', '|', ' ', ' '}
        };

        System.out.println("Input your character (X or O):");
      char symbol =  TicTacToe.checkSymbol();
      char symbol2 = ' ';

      if (symbol == 'X' || symbol == 'x') {
          symbol2 = 'O';
      }else if (symbol == '0' || symbol == 'o'){
          symbol2 = 'X';
      }
      while(symbol != 'X' && symbol != 'O' && symbol != 'x' && symbol != 'o' ){
          System.out.println("Invalid Character. Please input another character: ");
          symbol = TicTacToe.checkSymbol();
          if (symbol == 'X' || symbol == 'x') {
              symbol2 = '0';
          } else if (symbol == 'O' || symbol == 'o') {
              symbol2 = 'X';
          }
      }

      String Winner = TicTacToe.checkWinner(tictacBoard);

      TicTacToe.ticBoard(tictacBoard);
       while(true){
           System.out.println("Enter the position you wish to play in, ranging from 1-9: ");
           int position = input.nextInt();
           while (position > 9 || position == 0){
               System.out.println("The Position you inputted is out of bounds.");
               System.out.print("Please input a new position: ");
               position = input.nextInt();
               System.out.println();
           }

           while (playerpos.contains(position) || player2pos.contains(position)){
               System.out.println("Someone already played there");
               System.out.print("Play again: ");
               position = input.nextInt();
               System.out.println();
           }

           playerpos.add(position);

           Random random = new Random();
           int position2 = random.nextInt(9) + 1;
//           if (playerpos.size() > 5){
//               TicTacToe.ticBoard(tictacBoard);
//               System.out.println(Winner);
//               break;
//           }

           while(player2pos.contains(position2) || playerpos.contains(position2)){
               position2 = random.nextInt(9) + 1;
           }

           player2pos.add(position2);

           TicTacToe.inputValue(tictacBoard, position, symbol,"Player");
           Winner = TicTacToe.checkWinner(tictacBoard);
           if(!Winner.isEmpty()) {
               TicTacToe.ticBoard(tictacBoard);
               System.out.println(Winner);
               break;
           }

           TicTacToe.inputValue(tictacBoard, position2, symbol2,"Player2");
           TicTacToe.ticBoard(tictacBoard);

           Winner = TicTacToe.checkWinner(tictacBoard);
           if(!Winner.isEmpty()) {
              System.out.println(Winner);
              break;
          }
       }
    }
}