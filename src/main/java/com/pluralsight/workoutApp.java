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
                case "N" -> {
                    //addWorkout();
                }
                case "W" -> runWorkoutsScreen();
                case "X" -> running = false;
                default -> System.out.println("Error please pick N, W, or X");
            }
        }
    }

    static void runWorkoutsScreen() {
        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println("=== Workouts ===");
            System.out.println("A) All Workouts");
            System.out.println("Q) Quick Workouts");
            System.out.println("F) Favorites");
            System.out.println("S) Search");
            System.out.println("H) Home");
            System.out.print("Enter a command: ");

            String command = scanner.nextLine().trim().toUpperCase();

            switch (command) {
                case "A" -> {
                    //displayAllWorkouts();
                }
                case "Q" -> {
                    //displayQuickWorkouts();
                }
                case "S" -> runSearchScreen();
                case "H" -> running = false;
                default -> System.out.println("Error please pick A, Q, F, S, or H");
            }
        }

    }
    static void runSearchScreen() {
        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println("=== Search ===");
            System.out.println("1) By Name");
            System.out.println("2) By Type");
            System.out.println("3) By Length");
            System.out.println("0) Back");
            System.out.println("Enter a command: ");

            String command = scanner.nextLine().trim();

            switch (command) {
                case "1" -> {
                    //searchByName();
                }
                case "2" -> {
                    //searchByType();
                }
                case "3" -> {
                    //searchByLength():
                }
                case "0" -> running = false;
                default -> System.out.println("Error please pick 1, 2, 3, or 0 ");
            }
        }
    }

}
