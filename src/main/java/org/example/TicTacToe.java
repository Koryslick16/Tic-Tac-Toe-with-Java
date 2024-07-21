package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    static ArrayList<Integer> playerpos = new ArrayList<Integer>();
    static ArrayList<Integer> player2pos = new ArrayList<Integer>();


     public static void ticBoard (char[][] tictacBoard){

         for(char[] row: tictacBoard){
             for (char col: row){
                 System.out.print(col);
             }
             System.out.println();
         }

     }


     public static void inputValue(char[][] ticBoard, int position, String player){

         char symbol = ' ';

         if(player.equals("Player")){
              symbol = 'X';
              playerpos.add(position);
         }
         else if (player.equals("Player2")){
              symbol = 'O';
              player2pos.add(position);
         }

         switch (position){
             case 1:
                 ticBoard[0][1] = symbol;
                 break;
             case 2:
                 ticBoard[0][4] = symbol;
                 break;
             case 3:
                 ticBoard[0][6] = symbol;
                 break;
             case 4:
                 ticBoard[2][1] = symbol;
                 break;
             case 5:
                 ticBoard[2][4] = symbol;
                 break;
             case 6:
                 ticBoard[2][6] = symbol;
                 break;
             case 7:
                 ticBoard[4][1] = symbol;
                 break;
             case 8:
                 ticBoard[4][4] = symbol;
                 break;
             case 9:
                 ticBoard[4][6] = symbol;
                 break;
             default:
                 break;
         }
     }

     public static String checkWinner(){
       List winRow = Arrays.asList(1,2,3);
       List winRow2 = Arrays.asList(4,5,6);
       List winRow3 = Arrays.asList(7,8,9);
       List winCol = Arrays.asList(1,4,7);
       List winCol2 = Arrays.asList(2,5,8);
       List winCol3 = Arrays.asList(3,6,9);
       List winCross1 = Arrays.asList(1,5,9);
       List winCross2 = Arrays.asList(3,5,7);

       List<List> winner = new ArrayList<List>();
         winner.add(winRow);
         winner.add(winRow2);
         winner.add(winRow3);
         winner.add(winCol);
         winner.add(winCol2);
         winner.add(winCol3);
         winner.add(winCross1);
         winner.add(winCross2);

         for (List wins : winner){
             if(playerpos.containsAll(wins)){
                 return "Congratulations! You Won.";
             } else if (player2pos.containsAll(wins)) {
                 return "Computer Wins! Better Luck Next Time";
             } else if (playerpos.size() + player2pos.size() == 9) {
                 return "It's a Tie!";
             }
         }
                 return "";
     }

}
