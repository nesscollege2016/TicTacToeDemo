package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num of fibonacci numbers:");
        int n = scanner.nextInt();

        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        for (int i = 0; i < fibonacci.length; i++) {
           // System.out.print(fibonacci[i] + (i < n - 1 ? ", " : ""));
        }

        int x = n % 5 == 0 ? n / 5 : n / 5 + 1;
        int[][] fibD = new int[x][5];

        int counter = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < 5; j++) {
                if (counter >= n)
                    break;
                fibD[i][j] = fibonacci[counter];
                counter++;
            }
        }
        for (int i = 0; i < fibD.length; i++) {
            for (int j = 0; j < fibD[i].length; j++) {
                System.out.print(fibD[i][j] +", ");
            }
            System.out.println();
        }



    }
}
