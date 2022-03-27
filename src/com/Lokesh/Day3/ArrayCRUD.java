package com.Lokesh.Day3;

import javax.imageio.plugins.tiff.ExifInteroperabilityTagSet;
import java.util.Calendar;
import java.util.Optional;
import java.util.Scanner;

public class ArrayCRUD {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Students: ");
        int students = s.nextInt();
        ClassRoom Ece = new ClassRoom(students);
        System.out.println("Enter Students Details: ");
        for (int i = 0; i < students; i++) {
            System.out.println("Enter Student " + (i + 1) + " Details: ");
            Student student = new Student();
            System.out.println("Enter Student " + (i + 1) + " Name: ");
            String name = s.next();
            student.setName(name);
            System.out.println("Enter student " + (i + 1) + " Number: ");
            int number = s.nextInt();
            student.setNumber(number);
            Ece.addStudent(student);
        }



        // Menu
        String text;
        do{
            System.out.println("Press 1 to Find Student by roll number. ");
            System.out.println("Press 2 to Find Student by Name. ");
            System.out.println("Press 3 to Display All the Students. ");
            System.out.println("Press 4 to Delete Student by Roll Number: ");
            System.out.println("Press 5 to Delete Student by Name");
            System.out.println("Enter choice: ");
            int option = s.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter Roll Number to find the Student details: ");
                    Student std = Ece.FindStudentById(s.nextInt());
                    if(std != null){
                        System.out.println(std.getNumber() + "\t" + std.getName());
                    }
                    else{
                        System.out.println("Roll number does not exist.");
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter Name to find the Student details: ");
                    Student student = Ece.FindStudentByName(s.next());
                    if(student != null){
                        System.out.println(student.getNumber() + "\t" + student.getName());
                    }
                    else{
                        System.out.println("Student with this name does not exist.");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("List of All the Students is: ");
                    Ece.DisplayAllStudents();
                    break;
                case 4:
                    System.out.println("Enter Roll number to delete the student ");
                    int number = s.nextInt();
                    boolean ans = Ece.deleteStudentById(number);
                    if(ans){
                        System.out.println("Student " + number + " is deleted");
                    }
                    else{
                        System.out.println(number + " Does not exist");
                    }
                    break;
                case 5:
                    System.out.println("Enter Name of the student to delete: ");
                    String name  = s.next();
                    boolean response = Ece.deleteStudentByName(name);
                    if(response){
                        System.out.println("Student " + name + " deleted");
                    }
                    else{
                        System.out.println(name + " does not exist.");
                    }
                    break;

                default:
                    System.out.println("Enter valid input!");
                    break;
            }
            System.out.println("Do you want to continue? Press y/n");
            text = s.next();

        }while(text.equalsIgnoreCase("y"));

        System.out.println("Thank you");

    }
}

class ClassRoom {
    private Student[] std;
    private int index;

    ClassRoom(int size){
        std = new Student[size];
    }

    public void addStudent(Student student){
        std[index++] = student;
    }

    public void DisplayAllStudents(){
        for(int i = 0; i<std.length; i++){
            if(std[i] != null){
                System.out.println(std[i].getNumber() + "\t" + std[i].getName());
            }
        }
    }

    public Student FindStudentByName(String Name){
        Student student = null;
        for (int i = 0; i < std.length; i++) {
            if(std[i] != null){
                if(std[i].getName().equals(Name)){
                    student = std[i];
                }
            }
        }
        return student;
    }

    public Student FindStudentById(int number){
        Student student = null;
        for(int i = 0; i<std.length; i++){
            if(std[i].getNumber() == number){
                student = std[i];
            }
        }
        return student;
    }

    public boolean deleteStudentById(int number){
        boolean ans = false;
        for(int i = 0; i<std.length; i++){
            if(std[i] != null){
                if(std[i].getNumber() == number){
                    std[i] = null;
                    ans = true;
                }
            }
        }
        return ans;
    }

    public boolean deleteStudentByName(String Name){
        boolean ans = false;
        for(int i = 0; i<std.length; i++){
            if(std[i] != null){
                if(std[i].getName().equals(Name)){
                    std[i] = null;
                    ans = true;
                }
            }
        }
        return ans;
    }

}


class Student{
    private  String name;
    private int number;

    public void setName(String  name){
        this.name = name;
    }
    public void setNumber(int number){
        this.number = number;
    }

    public String getName(){
        return name;
    }
    public int getNumber(){
        return number;
    }
}
