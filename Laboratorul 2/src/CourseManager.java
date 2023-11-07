package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class CourseManager {
    Course [] courses;

    public CourseManager(){
        Connection conn = null;
        courses = new Course[0];
    }

    public void addCourse(Course course) {
        int newLength = courses.length + 1;
        Course[] aux = new Course[newLength];
        int index = 0;
        for (Course c : courses){
            aux[index++] = c;
        }
        aux[index] = course;
        this.courses = new Course[newLength];
        System.arraycopy(aux, 0, courses, 0, newLength);
    }

    public void displayCoursestoConsole(){
        for (Course c : courses) {
            System.out.println(c);
        }
    }

//2.
public void enrollStudent(String courseName, Student[] student) {
    for (Course course : courses) {
        if (course.name.equals(courseName)) {
            course.addStudent(student);
            System.out.println("Student:" + student.getFullName() + "Course: " + courseName);
            return;
        }
    }
}
//2.

//3.
public void listStudentsInCourse(String courseName) {
    for (Course course : courses) {
        if (course.name.equals(courseName)) {
            System.out.println("Course: " + courseName);
            for (Student student : course.students) {
                System.out.println("Student:" + student.getFullName());
            }
            return;
        }
    }
}

//4.
public double calculateCourseAverage(String courseName) {
    int totalGrade = 0;
    int totalStudents = 0;

    for (Course course : courses) {
        if (course.name.equals(courseName)) {
            for (Student student : course.students) {
                totalGrade += student.getGrade();
                totalStudents++;
            }
            if (totalStudents > 0) {
                return (double) totalGrade / totalStudents;
            }
        }
    }
}
//4.

//5.
public double calculateProfessorAverageGrade(Professor professor) {
    int totalGrade = 0;
    int totalStudents = 0;

    for (Course course : courses) {
        if (course.teacher.equals(professor)) {
            for (Student student : course.students) {
                totalGrade += student.getGrade();
                totalStudents++;
            }
        }
    }

    if (totalStudents > 0) {
        return (double) totalGrade / totalStudents;
    }
}
//5.
}
