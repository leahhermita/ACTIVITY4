/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

/**
 *
 * @author User
 */
// SchoolTest.java
public class SchoolTest {
    public static void main(String[] args) {
        Classroom classA = new Classroom("Class A");
        Classroom classB = new Classroom("Class B");

        Student s1 = new Student("Alice", 1);
        Student s2 = new Student("Bob", 2);

        classA.addStudent(s1);
        classA.addStudent(s2);

        System.out.println("Before Transfer:");
        classA.displayStudents();
        classB.displayStudents();

        classA.transferStudent(s1, classB);

        System.out.println("After Transfer:");
        classA.displayStudents();
        classB.displayStudents();
    }
}
