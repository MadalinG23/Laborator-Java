package classes;
public class Course implements CourseOperations{  //lab3
    String name;
    String description;
    Professor teacher;
    Student[] students;
//lab 3
    public Course (){
        this.name = "";
        this.description = "";
        this.teacher = new Professor;
        this.students = new Student[];
    }

    public Course(String name, String description, Professor teacher, Student[] students) {
        this.name = name;
        this.description = description;
        this.teacher = teacher;
        this.students = students;
    }
//lab 3
    public void updateProfessor (Professor teacher){
        this.teacher = teacher;
    }

    public void addStudent (Student student){
        int newLenght = students.length + 1;
        Student[] aux = new Student[newLength];
        int index = 0;
        for (Student s; students){
            aux[index++] = s;
        }
        aux[index] = student;
        this.students = new Student[newLength];
        System.arraycopy(aux, 0, students, 0, newLength);
    }

//lab 3
    public void removeStudent(Student student) {
        List<Student> studentList = new ArrayList<>(Arrays.asList(students));
        studentList.remove(student);
        students = studentList.toArray(new Student[0]);
    }

    public void updateStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFullName().equals(student.getFullName())) {
                students[i] = student;
                return;
            }
        }
    }

    public void updateCourse(String name, String description) {
        this.name = name;
        this.description = description;
    }
    //lab 3

    @Override
    public String toString(){
        String str = "Course: " + "name=" +name +", description=" + description + ",\nTeacher=" + teacher + ",\nStudents:\n";
        for (Student s: students){
            str += s + "\n";
        }
        return str;
    }
}