/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

/**
 *
 * @author User
 */
// Classroom.java
import java.util.ArrayList;

public class Classroom {
    String className;
    ArrayList<Student> students;

    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void displayStudents() {
        System.out.println("Students in " + className + ":");
        for (Student s : students) {
            s.displayInfo();
        }
    }

    public void transferStudent(Student student, Classroom newClassroom) {
        if (students.contains(student)) {
            removeStudent(student);
            newClassroom.addStudent(student);
        } else {
            System.out.println("Student not found in " + className);
        }
    }
}

