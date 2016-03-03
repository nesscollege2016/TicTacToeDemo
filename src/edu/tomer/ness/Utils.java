package edu.tomer.ness;

import java.util.Scanner;

/**
 * Created by Dev on 03/03/2016.
 */
public class Utils {

    static int factorial(int n){
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static int[] getIntArray(int n){
        int[] numbers = new int[n];
        //fill the array
        for (int i = 0; i < n; i++) {
            numbers[i] = getInt("Enter a number: ");
        }
        return numbers;
    }

    static int[] getIntArray(){
        int n = getInt("Enter the array size:");
        return getIntArray(n);
    }

    static int getInt(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        return x;
    }

    static String getString(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String s =   scanner.next();
        return s;
    }

    static void print(int[][] arr){
        print(arr,"%-4d");
    }

    static void print(int[][] arr, String format){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(format, arr[i][j]);
            }
            System.out.println();
        }
    }
}
