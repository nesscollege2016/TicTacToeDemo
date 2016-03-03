package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        String[][] ticTacToe = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ticTacToe[i][j] = scanner.next();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ticTacToe[i][j] + " ");
            }
            System.out.println();
        }

        //test for win in rows
        for (int i = 0; i < 3; i++) {
            if (ticTacToe[i][0].equals(ticTacToe[i][1])
                    && ticTacToe[i][1].equals(ticTacToe[i][2])){
                System.out.println(ticTacToe[i][1] + " wins");
                break;
            }
        }


        //test for win in columns
        for (int i = 0; i < 3; i++) {
            if (ticTacToe[0][i].equals(ticTacToe[1][i])
                    && ticTacToe[1][i].equals(ticTacToe[2][i])){
                System.out.println(ticTacToe[i][1] + " wins");
                break;
            }
        }

        //win in the first diagonal
        if (ticTacToe[0][0].equals(ticTacToe[1][1])
                && ticTacToe[1][1].equals(ticTacToe[2][2])){
            System.out.println(ticTacToe[0][0] + " wins");
        }

        //win in the 2nd diagonal
        if (ticTacToe[0][2].equals(ticTacToe[1][1])
                && ticTacToe[1][1].equals(ticTacToe[2][0])){
            System.out.println(ticTacToe[1][1] + " wins");
        }

        if ("".equals(null));

    }
}
