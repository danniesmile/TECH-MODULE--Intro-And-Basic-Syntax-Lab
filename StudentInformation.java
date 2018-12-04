package Others1;


import java.util.Scanner;

public class DemoDanielaPavlova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TECH MODULE - STUDENT INFORMATION
        // BY DANIELA PAVLOVA

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);

    }
}