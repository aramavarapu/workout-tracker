package com.pluralsight;
import java.util.Scanner;
public class workoutApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runHomeScreen();

    }

    static void runHomeScreen() {
        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println("=== Home ===");
            System.out.println("N) New Workout");
            System.out.println("W) Workouts");
            System.out.println("X) Exit");
            System.out.println("Enter a command: ");
            String command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "N":
                    //addWorkout();
                    break;
                case "W":
                    //runWorkoutsScreen();
                    break;
                case "X":
                    running = false;
                    break;
                default:
                    System.out.println("Error please pick N, W, or X");
            }
        }
    }
}
