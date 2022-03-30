package com.Lokesh.Day4;

import java.util.Scanner;

public class ToDoTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to tasks to do: ");
        int noOfTasks = s.nextInt();
        ToDoOperation operation = new ToDoOperation(noOfTasks);
//        for(int i = 0; i<noOfTasks; i++){
//            System.out.println("Enter task " + (i+1) + " details: ");
//            ToDoEntity task = new ToDoEntity();
//            System.out.println("Enter task " + (i+1) + " Name: ");
//            task.setTaskName(s.next() );
//            System.out.println();
//            System.out.println("Enter task "+ (i+1) + " ID: "  );
//            task.setId(s.nextInt());
//            System.out.println("Enter task " + (i+1) + " Duration in days : ");
//            task.setDuration(s.nextInt());
//        }

        char ch;
        do{
            System.out.println("Press 1 to add new Task ");
            System.out.println("Press 2 to display all the tasks");
            System.out.println("Press 3 to delete a task");
            System.out.println("Press 4 to find Task by name");
            System.out.println("Press 5 to find Task by ID");
            int choice = s.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter TASK-NAME to add a task");
                    break;
                case 2:
                    System.out.println("You pressed 2");
                    break;
                case 3:
                    System.out.println("You pressed 3");
                    break;
                case 4:
                    System.out.println("You pressed 4");
                    break;
                case 5:
                    System.out.println("You pressed 5");
                    break;
                default:
                    System.out.println("Please select any one the above options");
                    break;
            }
            System.out.println("Press Y/y to Continue.");
            ch = s.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
    }
}
