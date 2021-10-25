package lesson9_1;

import java.util.Random;

public class Tiger extends Animal implements IAnimal{

    public Tiger() {
        super("Tiger");
        this.generateSpeed();
    }

    @Override
    public void generateSpeed() {
        this.speed =(200 + (400 - 200) * new Random().nextDouble()) * 0.06;
    }

    @Override
    public boolean flyable() {
        return false;
    }


}
