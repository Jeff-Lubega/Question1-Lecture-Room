/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUDA GADGETS
 */
public class LectureRoom {
    private int numberOfStudents;
    private final boolean[] lights; // Array to represent lights (1, 2, 3)

    public LectureRoom() {
        this.numberOfStudents = 0;
        this.lights = new boolean[3]; // All lights off initially
    }

    // Add students
    public void addStudents(int count) {
        if (count > 0) {
            numberOfStudents += count;
            System.out.println(count + " students added. Total students: " + numberOfStudents);
        } else {
            System.out.println("Invalid number of students.");
        }
    }

    // Remove students
    public void removeStudents(int count) {
        if (count > 0) {
            numberOfStudents = Math.max(0, numberOfStudents - count);
            System.out.println(count + " students removed. Total students: " + numberOfStudents);
        } else {
            System.out.println("Invalid number of students.");
        }
    }

    // Turn on a specific light
    public void turnOnLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = true;
            System.out.println("Light " + lightNumber + " turned on.");
        } else {
            System.out.println("Invalid light number. Please choose between 1 and 3.");
        }
    }

    // Turn off a specific light
    public void turnOffLight(int lightNumber) {
        if (lightNumber >= 1 && lightNumber <= 3) {
            lights[lightNumber - 1] = false;
            System.out.println("Light " + lightNumber + " turned off.");
        } else {
            System.out.println("Invalid light number. Please choose between 1 and 3.");
        }
    }

    // Display the status of the room
    public void displayStatus() {
        System.out.println("Total students: " + numberOfStudents);
        System.out.print("Lights status: ");
        for (int i = 0; i < lights.length; i++) {
            System.out.print("Light " + (i + 1) + ": " + (lights[i] ? "On" : "Off") + " ");
        }
        System.out.println();
    }
}
    

