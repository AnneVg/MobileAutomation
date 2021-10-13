package lesson6;

import java.util.Random;

public class Animal {
    protected String name;
    protected int speed;
    public Animal(){
    }

    public Animal(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public  static  int randomSpeed(int minSpeed, int maxSpeed) {
        int actualSpeed = new Random().nextInt( (maxSpeed -minSpeed)+1) + minSpeed;
        return actualSpeed;

    }



}
