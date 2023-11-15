package classes;
public class Student extends Person implements Comparable<Student>{
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

//lab 4
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return groupNumber == student.groupNumber &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, groupNumber);
    }
    //lab 4
//ex 2
    @Override
    public int compareTo(Student other) {
        // Compare based on names
        int nameComparison = this.getFullName().compareTo(other.getFullName());

        if (nameComparison == 0) {
            // If names are the same, compare based on group number
            return Integer.compare(this.groupNumber, other.groupNumber);
        }

        return nameComparison;
    }
//ex 2
}
