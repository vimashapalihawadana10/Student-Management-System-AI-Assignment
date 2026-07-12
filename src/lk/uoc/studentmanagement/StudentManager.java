package lk.uoc.studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    Scanner input = new Scanner(System.in);


    public void addStudent() {

        System.out.print("Enter Student ID : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Name : ");
        String name = input.nextLine();

        System.out.print("Enter Age : ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter Course : ");
        String course = input.nextLine();

        Student student = new Student(id, name, age, course);

        students.add(student);

        System.out.println("Student Added Successfully!");
    }


    public void displayStudents() {

        if (students.isEmpty()) {

            System.out.println("No Students Found.");
            return;

        }

        for(Student student : students){

            student.displayStudent();

        }

    }

}