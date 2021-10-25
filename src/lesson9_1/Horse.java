package lesson9_1;

import java.util.Random;

public class Horse extends Animal implements IAnimal{

    public Horse() {
        super("Horse");
        this.generateSpeed();
    }
    @Override
    public void generateSpeed() {
        this.speed = (15 + (24 - 15) * new Random().nextDouble());
    }

    @Override
    public boolean flyable() {
        return false;
    }


}
