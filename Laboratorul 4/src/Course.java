package classes;
import java.util.HashSet;
import java.util.Set;


public class Course implements CourseOperations{
    String name;
    String description;
    Professor teacher;
    Set<Student> students; //lab 4
    public Course (){
        this.name = "";
        this.description = "";
        this.teacher = new Professor;
        this.students = new HashSet<>;  //lab 4
    }

    public Course(String name, String description, Professor teacher, Student[] students) {
        this.name = name;
        this.description = description;
        this.teacher = teacher;
        this.students = students;
    }
    public void updateProfessor (Professor teacher){
        this.teacher = teacher;
    }

    public void addStudent (Student student){
        students.add(student); //lab 4
    }

    public void removeStudent(Student student) {
        students.remove(student); //lab 4
    }

    //lab 4
    public void updateStudent(Student student) {
        students.remove(student);
        students.add(student);
    }
//lab 4
    public void updateCourse(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString(){
        String str = "Course: " + "name=" +name +", description=" + description + ",\nTeacher=" + teacher + ",\nStudents:\n";
        for (Student s: students){
            str += s + "\n";
        }
        return str;
    }
}