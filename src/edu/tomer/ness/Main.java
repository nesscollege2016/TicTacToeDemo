package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
}
