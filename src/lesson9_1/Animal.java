package lesson9_1;

public class Animal{
    protected double speed;
    protected String typeAnimal;

    public Animal() {
    }

    public Animal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public Animal(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }
}
