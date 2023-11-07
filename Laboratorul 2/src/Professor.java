package classes;

public class Professor {
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return "Professor{" + "firstName=" + firstName + ", lastname=" + lastName + '}';
    }

    public Professor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

// 1.
    public String getFullName(){
        return firstName + " " + lastName;
    }
//1.
}