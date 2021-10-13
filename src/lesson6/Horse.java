package lesson6;

public class Horse extends Animal {
    public Horse(){

    }
    public Horse(String name, int speed) {
        super(name, speed);
    }
    public int run()
    {
        int horseSpeed= Animal.randomSpeed(20,90);
        this.setSpeed(horseSpeed);
        System.out.println("Horse speed is: " + horseSpeed);
        return horseSpeed;
    }
}
