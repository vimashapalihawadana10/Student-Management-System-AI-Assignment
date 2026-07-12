package lk.uoc.studentmanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Scanner input = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n================================================");
            System.out.println("         STUDENT MANAGEMENT SYSTEM");
            System.out.println("================================================");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("================================================");
            System.out.print("Enter your choice : ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    manager.addStudent();
                    break;

                case 2:
                    manager.displayStudents();
                    break;
                case 3:
                    manager.searchStudent();
                    break;
                case 4:
                    manager.updateStudent();
                    break;


                case 6:
                    System.out.println("\nThank you for using Student Management System.");
                    break;

                default:
                    System.out.println("Invalid Choice.");

            }

        } while (choice != 6);

    }

}