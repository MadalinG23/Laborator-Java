package classes;
//lab 3
public class Student extends Person {
    private int groupNumber;
    private int grade;

    public Student() {
        super("", "");
        this.groupNumber = 0;
        this.grade = 0;
    }

    public Student(String firstName, String lastName, int groupNumber) {
        super(firstName, lastName);
        this.groupNumber = groupNumber;
        this.grade = 0;
    }
//lab 3

    @Override
    public String toString(){
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ",groupNumber =" + groupNumber + '}';
    }

    public int getGroupNumber(){
        return groupNumber;
    }

    public void setGroupNumber (int groupNumber){
        this.groupNumber = groupNumber;
    }

    int grade;
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
