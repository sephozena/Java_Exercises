package StudentGradingSystem;

public class Gradebook {
    private Student[] students;

    public Gradebook(Student[] students) {
        this.students = students;
    }

    public void printGrades() {
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGrade());
        }
    }

    public double calculateAverage() {
        int sum = 0;
        for (Student student : students) {
            sum += student.getGrade();
        }
        return (double) sum / students.length;
    }
}