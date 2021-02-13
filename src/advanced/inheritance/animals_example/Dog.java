package advanced.inheritance.animals_example;

public class Dog extends Animal {
    private String breed;


    public Dog(String breed, String voice, boolean mamal) {
        super(voice, mamal);
        this.breed = breed;

    }

    @Override
    public String yieldVoice() {
        return "Dog voice: " + voice;
    }
}
