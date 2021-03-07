package advanced.NamuDarbai3;

public class Developer extends Person {

    int ageOfExperience;

    public Developer(String name, int ageOfExperience) {
        super(name, ageOfExperience);



    }
    //       * Using an object of type JavaDeveloper call a method that is defined in Developer
    //class. Method should print the name and age of experience.
    public void spausdinti(){

        System.out.println(super.name);
        System.out.println(ageOfExperience);
    }

}
