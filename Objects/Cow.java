package Objects;

public class Cow implements Animal {

    public Cow() {
    }

    @Override
    public void birth() {
        System.out.println("Cow gives birth to a calf.");
    }

    @Override
    public void giveMilk() {
        System.out.println("Cow gives milk.");
    }

    @Override
    public void sound() {
        System.out.println("Cow says moo.");
    }
}
