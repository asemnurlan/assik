
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        School school = new School();

        // Add sample students
        Student student1 = new Student("Harry", "Potter", 21, true);
        student1.AddGrade(78);
        student1.AddGrade(89);
        student1.AddGrade(99);
        student1.AddGrade(51);
        school.addMember(student1);

        Student student2 = new Student("Ron", "Qeasley", 20, true);
        student2.AddGrade(78);
        student2.AddGrade(89);
        student2.AddGrade(75);
        student2.AddGrade(63);
        student2.AddGrade(82);

        school.addMember(student2);

        // Add sample teachers
        Teacher teacher1 = new Teacher("Severus", "Snape", 51, true, "Math", 7, 800000);
        teacher1.Raise(10);
        school.addMember(teacher1);

        Teacher teacher2 = new Teacher("Albus", "Dumbledore", 71, true, "English", 25, 1500000);
        school.addMember(teacher2);

        // Print all members
        System.out.println(school);

        // Display GPA of students
        for (Person member : school.getMembers()) {
            if (member instanceof Student) {
                Student student = (Student) member;
                System.out.println(student.toString() + " GPA: " + student.CalculateGPA());
            }
        }
    }
}