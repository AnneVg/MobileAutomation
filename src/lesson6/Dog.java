package lesson6;

public class Dog extends Animal {
    public Dog(){

    }
    public Dog(String name, int speed) {
        super(name, speed);
    }
    public int run()
    {
        int dogSpeed = Animal.randomSpeed(10,45);
        this.setSpeed(dogSpeed);
        System.out.println("Dog speed is: " + dogSpeed);
        return dogSpeed;
    }
}
