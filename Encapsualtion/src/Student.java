
//write a java program to create a class called student  with private instance variables student_id ,student _name and grades
//provide a public getter and setter methods to access and modify the student_id and student name variables.
//however provide a method called addGrade that allows adding a grade to the grades variable while performing additional  validation
import java.util.ArrayList;
import java.util.List;
public class Student {
    private int student_id;
    private String student_name;
    private List<Integer> grades;
//class constructor
    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.grades = new ArrayList<>();
    }

    public int getStudentId() {
        return student_id;
    }

    public void setStudentId(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentName() {
        return student_name;
    }

    public void setStudentName(String student_name) {
        this.student_name = student_name;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    //function to add grades to the grades variable while performing additional validation
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println("Grade added: " + grade);
        } else {
            System.out.println("Invalid grade. Grade should be between 0 and 100.");
        }
    }


    public static void main(String[] args) {
        // Creating a Student object and testing the methods
        Student student = new Student(1, "Atim Sarah");
        student.addGrade(85);
        student.addGrade(92);
        student.addGrade(105); // Invalid grade

        System.out.println("Before updating");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Grades: " + student.grades);
        System.out.println();
        System.out.println("After updating");
        student.setStudentId(2);
        student.setGrades(List.of(90, 98, 100));

        student.setStudentName("Muzaki Tracy");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Student Grades: " + student.grades);
    }


}

