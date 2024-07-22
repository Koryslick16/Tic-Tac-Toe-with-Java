package org.example;

public class PrintAsterisk {

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


}
