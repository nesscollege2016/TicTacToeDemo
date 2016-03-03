package edu.tomer.ness;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    static void targil1(){
        int n1 = getInt("Enter the first number:");
        int n2 = getInt("Enter the 2nd number:");
        System.out.println(add(n1, n2));
    }
    //returns an int[]
    static int[] fibonacci(int n){
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    static int add(int n1, int n2){
        return n1 + n2;
    }

    static int getInt(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        int x  = sc.nextInt();
        return x;
    }

    static String getString(String message){
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + i<arr.length - 1 ? ", ": "");
        }
    }

    static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%-5d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
