package com.Lokesh.Day4;

import jdk.dynalink.Operation;

import java.util.Optional;

/**
 * Task is an array of Objects(tasks)
 * ToDoEntity is an Object
 */
public class ToDoOperation {

    private ToDoEntity[] Tasks;
    private  int index;

    public  ToDoOperation(int size){
        Tasks = new ToDoEntity[size];
    }



    public void addTask(ToDoEntity toDo){
        Tasks[index++] = toDo;
    }

    public  void displayAllTasks(){
        for(int i = 0; i<Tasks.length; i++){
            if(Tasks[i] != null){
                System.out.println("Task " + (i+1) + " details: ");
                System.out.println("ID: " + Tasks[i].getId());
                System.out.println("Name: " + Tasks[i].getTaskName());
                System.out.println("Duration in Days: " + Tasks[i].getDuration());
                System.out.println("**********************************");
            }
        }
    }
}
