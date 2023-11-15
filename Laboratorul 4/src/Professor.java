package classes;
public class Professor extends Person {
    public Professor() {
        super("", "");
    }

    public Professor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Professor{" + "firstName=" + firstName + ", lastname=" + lastName + '}';
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
}