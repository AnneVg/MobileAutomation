package lesson9_1;

import java.util.Random;

public class Elephant extends Animal implements IAnimal{

    public Elephant() {
        super("Elephant");
        this.generateSpeed();
    }
    @Override
    public void generateSpeed() {
       this.speed = (3 + (4 - 3) * new Random().nextDouble())*6.0;
    }

    @Override
    public boolean flyable() {
        return false;
    }


}
