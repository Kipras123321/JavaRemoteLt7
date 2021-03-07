package advanced.NamuDarbai3;

public class JavaDeveloper extends Developer {
    public static void main(String[] args) {

    }
    public JavaDeveloper(String name, int ageOfExperience) {
        super(name, ageOfExperience);

        JavaDeveloper javaDeveloper = new JavaDeveloper("jonas", 5);

       // Developer<JavaDeveloper> javaDeveloperDeveloper = new Developer<>(JavaDeveloper)
        JavaDeveloper developerJavaDeveloper = new JavaDeveloper("Jon", 10);



        javaDeveloper.spausdinti();
    }
}
