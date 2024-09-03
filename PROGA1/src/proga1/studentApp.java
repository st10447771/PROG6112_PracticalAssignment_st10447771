/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proga1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ST10447771
 */
public class studentApp {
    
    public static void main(String[] args){
        try (java.util.Scanner scanner = new Scanner(System.in)) {
            System.out.println("STUDENT MANAGEMENT APPLICATION");
            System.out.println("******************************");
            System.out.println("Enter '1' to launch the menu or any other key to exit.");
            String input = scanner.nextLine();
            
            //Code Attribution
            //This method was taken from stackoverslow
            //https://stackoverflow.com/questions/39513274/java-input-scanner-and-if-statement
            //Tina Ditte
            //https://stackoverflow.com/users/6831124/tina-ditte
            if("1".equals(input)){
                launchMenu(scanner);
            } else {
                exitApplication();
            }
        }
    }

    public static void exitApplication() {
        System.out.println("Exiting the application. Goodbye!");
        System.exit(0);
    }
    
    public static final ArrayList<String> students = new ArrayList<>();
    public static void launchMenu(Scanner scanner){
        
         System.out.println("\n---- Main Menu ----");
            System.out.println("1. Capture a new student");
            System.out.println("2. Search for a student");
            System.out.println("3. Delete a student");
            System.out.println("4. Print student report");
            System.out.println("5. Exit Application");
            System.out.print("Enter a number option: ");          
            String choice = scanner.nextLine();
            
            if("1".equals(choice)){
            saveStudent(scanner);
        } if("2".equals(choice)){
            searchStudent(scanner);
        } if("3".equals(choice)){
            deleteStudent(scanner);
        } if("4".equals(choice)){
            studentReport(scanner);
        } if("5".equals(choice)){
            studentApp.exitApplication();
        }
             

    }

    //Code Attribution
            //This method was taken from stackoverslow
            //https://stackoverflow.com/questions/16098134/how-to-get-arraylistinteger-and-scanner-to-play-nice
            //Samwise Gibbens
            //https://stackoverflow.com/users/2297886/samwise-gibbens
    public static void saveStudent(Scanner scanner) {
        System.out.println("CAPTURE A NEW STUDENT");
        System.out.println("******************************");
        System.out.println("Enter a student ID that is 5 characters in length.");
        String studID = scanner.nextLine();
        students.add(studID);
        System.out.println("Enter the student name:");
        String name = scanner.nextLine();
        students.add(name);
        int age;
        do{
            System.out.println("Enter student age. (Must be over 16)");
            age = scanner.nextInt();
        } while (age <= 16);
        scanner.nextLine();
        System.out.println("Enter the student email:");
        String studEmail = scanner.nextLine();
        students.add(studEmail);
        System.out.println("Enter the student course:");
        String course = scanner.nextLine();
        students.add(course);
        System.out.println("Student successfully captured!");
        System.out.println("Enter '1' to launch the menu or any other key to exit.");
        String input = scanner.nextLine();
        
        if("1".equals(input)){
         launchMenu(scanner);
        } else {
            studentApp.exitApplication();
        }
        scanner.close();   
    }

    //Code Attribution
            //This method was taken from stackoverslow
            //https://stackoverflow.com/questions/5071040/java-convert-integer-to-string
            //Ibungo
            //https://stackoverflow.com/users/2613054/ibungo
    public static void searchStudent(Scanner scanner) {
        System.out.println("Enter student ID to search:");
        int studId = scanner.nextInt();
        String stdID = Integer.toString(studId);
        
        if(students.contains(stdID)){
            System.out.println("Student with ID: " + stdID + " found!");
        } else {
            System.out.println("Student with ID: " + stdID + " not found!");
        }
        System.out.println("Enter '1' to launch the menu or any other key to exit.");
        String input = scanner.nextLine();
        
        if("1".equals(input)){
            launchMenu(scanner);
        } else {
            studentApp.exitApplication();
        }
        scanner.close();
    }

    public static void deleteStudent(Scanner scanner) {
        System.out.println("Enter student ID to delete:");
        int studId = scanner.nextInt();
        String stdID = Integer.toString(studId);
        
        if(students.contains(stdID)){
            System.out.println("Are you sure you wan t delete student " + stdID + " from the system? Yes(Y) to delete.");
            String option = scanner.next(); 
            System.out.println("--------------------------------------");
            if("Y".equals(option)){
            students.remove(stdID);
            }
        } if(!students.contains(stdID)) {
            System.out.println("Student ID not found.");
        }
        System.out.println("Student ID:" + stdID + "WAS deleted!");
        System.out.println("Enter '1' to launch the menu or any other key to exit.");
        String input = scanner.nextLine();
        
        if("1".equals(input)){
            launchMenu(scanner);
        } else {
            studentApp.exitApplication();
        }
        scanner.close();
    }

    //Code Attribution
            //This method was taken from stackoverslow
            //https://stackoverflow.com/questions/762400/how-to-display-all-elements-in-an-arraylist
            //Carl Manaster
            //https://stackoverflow.com/users/82118/carl-manaster
    public static void studentReport(Scanner scanner) {
        System.out.println("\n---Students Report---");
        if(students.isEmpty()){
            System.out.println("No students found.");
        } else {
            int studentNumber = 1;
            for( String Student: students ){
                System.out.println("STUDENT" + studentNumber);
                System.out.println("-------------------------------");
                System.out.println(Student);
                System.out.println("-------------------------------");
                studentNumber++;
            }
            }
            System.out.println("Enter '1' to launch the menu or any other key to exit.");
        String input = scanner.nextLine();
        
        if("1".equals(input)){
            launchMenu(scanner);
        } else {
            studentApp.exitApplication();
        }
        scanner.close();
        }
    }
