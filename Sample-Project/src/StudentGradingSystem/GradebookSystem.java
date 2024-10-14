package StudentGradingSystem;

import java.util.Scanner;

public class GradebookSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.next();
            System.out.print("Enter student grade: ");
            int grade = scanner.nextInt();
            students[i] = new Student(name, grade);
        }

        Gradebook gradebook = new Gradebook(students);

        System.out.println("\nStudent Grades:");
        gradebook.printGrades();

        System.out.println("\nAverage Grade: " + gradebook.calculateAverage());
        scanner.close();
    }
}