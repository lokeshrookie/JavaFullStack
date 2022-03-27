package com.Lokesh.Day3;

import java.util.Scanner;

public class TwoDimenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("No of Classes: " );
        int classes = input.nextInt();
        System.out.println("Enter No Students per Class: ");
        int students = input.nextInt();
        int[][] arr = new int[classes][students];
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter Class " + (i+1) + " Details: ");
            for(int j = 0; j<arr[i].length; j++){
                System.out.println("Enter Student " + (j+1)+ " marks: ");
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Class " + (i+1) + " Details : ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Marks of Student" + j+1+  " : " + arr[i][j]);
            }
            System.out.println("*************************");
        }


    }


}
