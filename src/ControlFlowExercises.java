import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//        int count = 0;
//        do {
//            System.out.println(count);
//            count += 2;
//        } while (count <= 100);
//        for (int count = 0; count <= 100; count += 2) {
//
//            System.out.println(count);
//        }
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("fizzbuzz");
//
//            } else if (i % 5 ==0) {
//                System.out.println("buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("fizz");
//            }
//            }
        Scanner scanner = new Scanner(System.in);
//
//        do {
//            // Prompt the user to enter an integer
//            System.out.print("Enter an integer: ");
//            int maxValue = scanner.nextInt();
//
//            // Display a table of squares and cubes
//            System.out.printf("%-10s%-10s%-10s\n", "Number", "Square", "Cube");
//            for (int i = 1; i <= maxValue; i++) {
//                int square = i * i;
//                int cube = i * i * i;
//                System.out.printf("%-10d%-10d%-10d\n", i, square, cube);
//            }
//
//            // Ask if the user wants to continue
//            System.out.print("Do you want to continue? (yes/no): ");
//            String response = scanner.next();
//
//            // Check if the user wants to continue
//            if (!response.equalsIgnoreCase("yes")) {
//                break; // Exit the loop if the user doesn't want to continue
//            }
//
//        } while (true); // Loop continues until user decides to stop
//
//        // Close the scanner to prevent resource leaks
//        scanner.close();
        do {
            // Prompt the user for a numerical grade
            System.out.print("Enter a numerical grade (0-100): ");
            int numericalGrade = scanner.nextInt();


            String letterGrade;
            if (numericalGrade >= 88 && numericalGrade <= 100) {
                letterGrade = "A";
            } else if (numericalGrade >= 80 && numericalGrade <= 87) {
                letterGrade = "B";
            } else if (numericalGrade >= 67 && numericalGrade <= 79) {
                letterGrade = "C";
            } else if (numericalGrade >= 60 && numericalGrade <= 66) {
                letterGrade = "D";
            } else {
                letterGrade = "F";
            }

            // Display the corresponding letter grade
            System.out.println("Letter grade: " + letterGrade);

            // Ask if the user wants to continue
            System.out.print("Do you want to continue? (yes/no): ");
            String response = scanner.next();

            // Check if the user wants to continue
            if (!response.equalsIgnoreCase("yes")) {
                break; // Exit the loop if the user doesn't want to continue
            }

        } while (true); // Loop continues until user decides to stop

        // Close the scanner to prevent resource leaks
        scanner.close();
        }
        }

