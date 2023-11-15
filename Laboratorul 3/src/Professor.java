package classes;
// lab 3
public class Professor extends Person {
    public Professor() {
        super("", "");
    }

    public Professor(String firstName, String lastName) {
        super(firstName, lastName);
    }
// lab 3

    @Override
    public String toString() {
        return "Professor{" + "firstName=" + firstName + ", lastname=" + lastName + '}';
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
}