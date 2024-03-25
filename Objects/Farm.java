package Objects;

public class Farm {
    private Animal[] animals;

    private int cow_milk;
    private int goat_milk;
    private int sheep_milk;

    private int cow_birth;
    private int goat_birth;
    private int sheep_birth;

    public Farm(Animal[] animals) {
        this.animals = animals;
        cow_milk = 0;
        goat_milk = 0;
        sheep_milk = 0;
        cow_birth = 0;
        goat_birth = 0;
        sheep_birth = 0;
    }

    public void animalSounds() {
        for (Animal animal : animals) {
            animal.sound();
        }
    }

    public void animalBirths() {
        for (Animal animal : animals) {
            animal.birth();
            if (animal instanceof Cow) {
                cow_birth++;
            } else if (animal instanceof Goat) {
                goat_birth++;
            } else if (animal instanceof Sheep) {
                sheep_birth++;
            }
        }
    }

    public void animalMilk() {
        for (Animal animal : animals) {
            animal.giveMilk();
            if (animal instanceof Cow) {
                cow_milk++;
            } else if (animal instanceof Goat) {
                goat_milk++;
            } else if (animal instanceof Sheep) {
                sheep_milk++;
            }
        }
    }

    public void printStatistics() {
        System.out.println("Cow milk: " + cow_milk);
        System.out.println("Goat milk: " + goat_milk);
        System.out.println("Sheep milk: " + sheep_milk);
        System.out.println("Cow births: " + cow_birth);
        System.out.println("Goat births: " + goat_birth);
        System.out.println("Sheep births: " + sheep_birth);
    }
}
