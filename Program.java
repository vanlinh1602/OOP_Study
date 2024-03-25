
import java.util.Scanner;

import Objects.Animal;
import Objects.Farm;

public class Program {
    public static void main(String[] args) {
        Animal[] animals = new Animal[10];

        animals[0] = new Objects.Cow();
        animals[1] = new Objects.Goat();
        animals[2] = new Objects.Cow();
        animals[3] = new Objects.Goat();
        animals[4] = new Objects.Cow();
        animals[5] = new Objects.Sheep();
        animals[6] = new Objects.Cow();
        animals[7] = new Objects.Sheep();
        animals[8] = new Objects.Cow();
        animals[9] = new Objects.Sheep();

        Farm farm = new Farm(animals);
        // farm.animalSounds();

        farm.animalBirths();
        farm.animalMilk();
        farm.animalBirths();

        farm.printStatistics();

    }
}
