package advanced.inheritance.animals_example;

public class Cat extends Animal {

    private String color;


    public Cat(String color, String voice, boolean mamal) {
       super(voice, mamal);
       this.color = color;

    }

    @Override
    public String yieldVoice() {
        return "Cat voice: " + voice;
    }
}
