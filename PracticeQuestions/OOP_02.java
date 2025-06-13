package PracticeQuestions;

class Student {
    String name;
    int rollNumber;
    int marks;

    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void showDetails() {
        System.out.println("Student name is " + name + ", Roll Number is " + rollNumber + " And their marks is " + marks);
    }
}

public class OOP_02 {
    public static void main(String[] args) {
        Student Ankit = new Student("Ankit", 34,78);
        Student Adu = new Student("Adu", 16, 99);

        Ankit.showDetails();
        Adu.showDetails();
    }
}
