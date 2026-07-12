package lk.uoc.studentmanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Scanner input = new Scanner(System.in);

        int choice;

        do{

            System.out.println("\n========== STUDENT MANAGEMENT ==========");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");

            choice = input.nextInt();

            switch(choice){

                case 1:
                    manager.addStudent();
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");

            }

        }while(choice!=6);

    }

}