public class StudentResult {

    public static void main(String[] args) {

        String name = "ROSAN";
        int marks = 90;

        char grade;

        if (marks >= 90) {
            grade = 'S';
        } else if (marks >= 80) {
            grade = 'A';
        } else if (marks >= 70) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else if (marks >= 50) {
            grade = 'D';
        } else if (marks >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("----- RESULT -----");
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}