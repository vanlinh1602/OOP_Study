package Objects;

public class Sheep implements Animal {
    public Sheep() {
    }

    public void sound() {
        System.out.println("Sheep says beee.");
    }

    public void giveMilk() {
        System.out.println("Sheep gives milk.");
    }

    public void birth() {
        System.out.println("Sheep gives birth to a lamb.");
    }
}
