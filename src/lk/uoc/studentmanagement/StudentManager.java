package lk.uoc.studentmanagement;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    // Add Student
    public void addStudent() {

        int id;

        while (true) {

            try {

                System.out.print("Enter Student ID : ");
                id = input.nextInt();
                input.nextLine();

                if (findStudent(id) != null) {

                    System.out.println("Student ID already exists!");
                    return;

                }

                break;

            } catch (InputMismatchException e) {

                System.out.println("Invalid ID. Numbers only.");
                input.nextLine();

            }

        }

        System.out.print("Enter Name : ");
        String name = input.nextLine();

        int age;

        while (true) {

            try {

                System.out.print("Enter Age : ");
                age = input.nextInt();
                input.nextLine();

                break;

            } catch (InputMismatchException e) {

                System.out.println("Invalid age. Please enter numbers only.");
                input.nextLine();

            }

        }

        System.out.print("Enter Course : ");
        String course = input.nextLine();

        students.add(new Student(id, name, age, course));

        System.out.println("\nStudent Added Successfully.");

    }

    // Helper Method
    private Student findStudent(int id) {

        for (Student student : students) {

            if (student.getStudentId() == id) {

                return student;

            }

        }

        return null;

    }


    // Display Students
    public void displayStudents() {

        if (students.isEmpty()) {

            System.out.println("\nNo Students Found.");
            return;

        }

        System.out.println("\n--------------------------------------------------------------");
        System.out.printf("%-10s %-20s %-10s %-15s%n", "ID", "NAME", "AGE", "COURSE");
        System.out.println("--------------------------------------------------------------");

        for (Student student : students) {

            System.out.printf("%-10d %-20s %-10d %-15s%n",
                    student.getStudentId(),
                    student.getName(),
                    student.getAge(),
                    student.getCourse());

        }

        System.out.println("--------------------------------------------------------------");

    }


    // Search Student
    public void searchStudent() {

        System.out.print("Enter Student ID : ");

        int id = input.nextInt();

        Student student = findStudent(id);

        if (student == null) {

            System.out.println("Student Not Found.");
            return;

        }

        System.out.println("\nStudent Found");
        System.out.println("---------------------------");
        System.out.println("ID      : " + student.getStudentId());
        System.out.println("Name    : " + student.getName());
        System.out.println("Age     : " + student.getAge());
        System.out.println("Course  : " + student.getCourse());
        System.out.println("---------------------------");

    }


    // Update Student
    public void updateStudent() {

        System.out.print("Enter Student ID : ");

        int id = input.nextInt();
        input.nextLine();

        Student student = findStudent(id);

        if (student == null) {

            System.out.println("Student Not Found.");
            return;

        }

        System.out.println("\nCurrent Name : " + student.getName());

        System.out.print("Enter New Name : ");
        student.setName(input.nextLine());

        System.out.print("Enter New Age : ");
        student.setAge(input.nextInt());
        input.nextLine();

        System.out.print("Enter New Course : ");
        student.setCourse(input.nextLine());

        System.out.println("Student Updated Successfully.");

    }

    // Delete Student
    public void deleteStudent() {

        System.out.print("Enter Student ID : ");

        int id = input.nextInt();
        input.nextLine();

        Student student = findStudent(id);

        if (student == null) {

            System.out.println("Student Not Found.");
            return;

        }

        System.out.print("Delete Student (Y/N): ");

        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("Y")) {

            students.remove(student);

            System.out.println("Student Deleted Successfully.");

        } else {

            System.out.println("Delete Cancelled.");

        }

    }

}