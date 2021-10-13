package lesson6;

public class Tiger extends Animal {
    public Tiger() {
    }

    public Tiger(String name, int speed) {
        super(name, speed);
    }
    public int run()
    {
        int tigerSpeed = Animal.randomSpeed(30,100);
        this.setSpeed(tigerSpeed);
        System.out.println("Tiger speed is: " + tigerSpeed);
        return tigerSpeed;
    }
}
