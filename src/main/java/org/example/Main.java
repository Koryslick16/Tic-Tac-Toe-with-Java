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
                {' ', ' ', '|', ' ', '|', ' ', ' '}
        };

      char symbol =  TicTacToe.checkSymbol();
      char symbol2;

      if (symbol == 'X') {
          symbol2 = 'O';
      }else {
          symbol2 = 'X';
      }

      TicTacToe.ticBoard(tictacBoard);
       while(true){
           System.out.println("Enter the position you wish to play in (1-9): ");
           int position = input.nextInt();
           if (position > 9){
               System.out.println("The Position you inputed is out of bounds. Please input a new position: ");
               position = input.nextInt();
           }

           if (playerpos.contains(position) || player2pos.contains(position)){
               System.out.println("Someone already played there");
               System.out.print("Play again: ");
               position = input.nextInt();
           }

           playerpos.add(position);

           Random random = new Random();
           int position2 = random.nextInt(9) + 1;
           while(player2pos.contains(position2) || playerpos.contains(position2)){
               position2 = random.nextInt(9) + 1;
           }

           player2pos.add(position2);

           TicTacToe.inputValue(tictacBoard, position, symbol,"Player");
           String Winner = TicTacToe.checkWinner(tictacBoard);
           if(!Winner.isEmpty()) {
               TicTacToe.ticBoard(tictacBoard);
               System.out.println(Winner);
               break;
           }

           TicTacToe.inputValue(tictacBoard, position2, symbol2,"Player2");
           TicTacToe.ticBoard(tictacBoard);

           Winner = TicTacToe.checkWinner(tictacBoard);
           if(!Winner.isEmpty()) {
              TicTacToe.ticBoard(tictacBoard);
              System.out.println(Winner);
              break;
          }
       }

    }
}