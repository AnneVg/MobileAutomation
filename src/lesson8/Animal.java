package lesson8;

import java.util.Random;

public class Animal extends AbstractAnimal {

    private String typeAnimal;
    private double speed;
    private boolean flyable;
    public Animal(String typeAnimal, boolean flyable,double speed) {
        this.typeAnimal = typeAnimal;
        this.flyable = flyable;
        this.speed = speed;
    }
    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }
    @Override
    protected boolean flyable() {
        return flyable;
    }

    @Override
    protected double speed() {
        return speed;
    }


    public void generateSpeed(int maxSpeed, int minSpeed) {
        int animalSpeed = new Random().nextInt( (maxSpeed -  minSpeed)+1) + minSpeed;
        this.speed = animalSpeed;
    }


}
