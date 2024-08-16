/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUDA GADGETS
 */import java.util.Scanner;
public class MainProgram {
    public static void main(String[] args) {
        LectureRoom room = new LectureRoom();
        try (Scanner scanner = new Scanner(System.in)) {
            char choice;
            
            do {
                System.out.println("Menu:");
                System.out.println("W - Add students");
                System.out.println("X - Remove students");
                System.out.println("Y - Turn on light");
                System.out.println("Z - Turn off light");
                System.out.println("Q - Quit");
                System.out.print("Enter your choice: ");
                choice = scanner.next().charAt(0);
                
                switch (choice) {
                    case 'W' -> {
                        System.out.print("Enter the number of students to add: ");
                        int addCount = scanner.nextInt();
                        room.addStudents(addCount);
                    }
                    case 'X' -> {
                        System.out.print("Enter the number of students to remove: ");
                        int removeCount = scanner.nextInt();
                        room.removeStudents(removeCount);
                    }
                    case 'Y' -> {
                        System.out.print("Enter the light number to turn on (1-3): ");
                        int lightOn = scanner.nextInt();
                        room.turnOnLight(lightOn);
                    }
                    case 'Z' -> {
                        System.out.print("Enter the light number to turn off (1-3): ");
                        int lightOff = scanner.nextInt();
                        room.turnOffLight(lightOff);
                    }
                    case 'Q' -> System.out.println("Quitting...");
                    default -> System.out.println("Invalid choice. Please enter a valid option.");
                }
                room.displayStatus(); // Display status after each action
                
            } while (choice != 'Q');
        }
    }
}
    

