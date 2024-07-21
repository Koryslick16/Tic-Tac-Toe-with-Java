package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    Scanner input = new Scanner(System.in);
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
         }
         else if (player.equals("Player2")){
              symbol = 'O';
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
       List winPositionRow = Arrays.asList(1,2,3);
       List winPositionRow1 = Arrays.asList(4,5,6);
       List winPositionRow3 = Arrays.asList(7,8,9);
       List winPositionCol = Arrays.asList(1,4,7);
       List winPositionCol2 = Arrays.asList(2,5,8);
       List winPositionCol3 = Arrays.asList(3,6,9);
       List winPositionCross1 = Arrays.asList(1,5,9);
       List winPositionCross2 = Arrays.asList(3,5,7);
                 return "";
     }

}
