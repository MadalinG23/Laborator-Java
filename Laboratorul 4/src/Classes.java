package classes;
public class Classes {
    public static void main(String[] args){
        Student[] students = new Student[]{new Student("Andrei", "Negoita", 2231), new Student("Ion", "Mateescu", 4221)};
        Professor prof = new Professor ("Anton", "Panaitescu");
        Course course = new Course("Material Resistance", "Calculations of reactions,\n" + "effort diagrams, calculations of geometric characteristics of \n" +  "flat surfaces and calculations of resistance elements to simple stresses\n", prof, students);
        CourseManager courseManager = new classes.CourseManager();
        courseManager.AddCourse(course);
        courseManager.DisplayCoursesToConsole();
    }
}
