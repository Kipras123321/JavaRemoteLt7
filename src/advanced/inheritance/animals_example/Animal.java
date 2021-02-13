package advanced.inheritance.animals_example;

public abstract class Animal {
    protected String voice;
    protected boolean mamal;


    public Animal(String voice, boolean mamal) {
        this.voice = voice;
        this.mamal = mamal;

    }

    public abstract String yieldVoice ();
    public void printAnimal() {
        System.out.println(mamal + "" + voice);

    }

}
