package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class CourseManager implemets ManagerCourseOperations {
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

//lab 3
public void updateCourse(Course course) {
    for (int i = 0; i < courses.length; i++) {
        if (courses[i].name.equals(course.name)) {
            courses[i] = course;
            return;
        }
    }
}

    public void deleteCourse(Course course) {
        List<Course> courseList = new ArrayList<>(Arrays.asList(courses));
        courseList.remove(course);
        courses = courseList.toArray(new Course[0]);
    }
//lab 3

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
