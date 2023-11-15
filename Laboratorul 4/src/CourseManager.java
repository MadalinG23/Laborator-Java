package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;

public class CourseManager implemets ManagerCourseOperations {
    List<Course> courses; //lab 4

    public CourseManager(){
        courses = new ArrayList<>(); //lab 4
    }

    public void addCourse(Course course) {
        courses.add(course); //lab 4
    }

    //lab 3
    public void updateCourse(Course course) {

    }

    public void deleteCourse(Course course) {
        courses.remove(course); //lab 4
    }
//ex 1
    public Map<Integer, List<Student>> groupStudentsByGroupNumber() {
        Map<Integer, List<Student>> groupedStudents = new HashMap<>();

        for (Course course : courses) {
            for (Student student : course.students) {
                groupedStudents.computeIfAbsent(student.getGroupNumber(), k -> new ArrayList<>()).add(student);
            }
        }

        return groupedStudents;
    }
//ex 1
//ex 3
    public void sortCourses(Comparator<Course> comparator) {
        Collections.sort(courses, comparator);
    }
//ex 3
//ex 4
public Course searchCourseByName(String courseName) {
    for (Course course : courses) {
        if (course.name.equals(courseName)) {
            return course;
        }
    }
//ex 4
    public void displayCoursestoConsole(){
        for (Course c : courses) {
            System.out.println(c);
        }
    }
    public void enrollStudent(String courseName, Student[] student) {
        for (Course course : courses) {
            if (course.name.equals(courseName)) {
                course.addStudent(student);
                System.out.println("Student:" + student.getFullName() + "Course: " + courseName);
                return;
            }
        }
    }
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
}
