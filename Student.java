package com.khubaib;

import java.util.Scanner;

public class Student {

    private int student_id;
    private double marks;

    //student constructor
    Student (int studentID, double totalMarks){

        student_id = studentID;
        marks = totalMarks;

    }

    //marks constructor
    public double getMarks(){
        return marks;
    }

    //students id constructor
    public int getStudent_id(){
        return student_id;
    }
}

class StudentTesting {

    public static void main(String[] args) {

        //array declared
        Student[] studentArray = new Student[7];

        //input declared
        Scanner input = new Scanner(System.in);

        //variables declared
        double total = 0;
        double average;
        int cms_Id;
        double marks;

        //inputs are taken here
        for (int i =0;i < 7; i++){

            System.out.print("Enter the cms id of student "+(i+1)+" : ");
            cms_Id = input.nextInt();
            System.out.print("Enter the marks of the student "+(i+1)+" : ");
            marks = input.nextDouble();

            while (marks <0 || marks >100){//marks are not entered if they are greater than hundred or less than 0
                System.out.println("marks are not in the range of 0 and 100, enter the correct marks: ");
                marks = input.nextDouble();
            }

            studentArray[i] = new Student(cms_Id, marks);//inputs put in the array
            System.out.println();
        }

        //all the marks are added
        for (int i = 0 ; i<7; i++){
            total += studentArray[i].getMarks();
        }

        //the average of the marks is taken
        average = total/7;

        //the average is printed
        System.out.println("the average is : "+ average);
    }
}
