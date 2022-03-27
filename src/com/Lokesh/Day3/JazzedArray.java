package com.Lokesh.Day3;

import java.util.Scanner;

public class JazzedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no of classrooms: ");
        int classes = s.nextInt();
        int[][] arr = new int[classes][];
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter no of students in class " + (i+1) + " : ");

            int students = s.nextInt();
            arr[i] = new int[students];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Class " + (i+1) +  " Details: ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter student " + (j+1) + " marks: ");
                arr[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Class " + (i+1) + " details : ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" marks of student " + (j+1) + " is : " );
                System.out.println(arr[i][j]);
            }
            System.out.println("**************************************");
        }

    }
}
