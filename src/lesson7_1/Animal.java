package lesson7_1;

import lesson7.House;

import java.util.Random;

public class Animal {
    private final String name;
    private final int speed;
    private final boolean flyable;

    private Animal(Builder builder) {
        this.name = builder.name;
        this.flyable = builder.flyable;
        this.speed = builder.speed;
    }

    public static class Builder {
        private String name;
        private int speed;
        private boolean flyable;
        Builder(){}
        public Builder canFly(boolean flyable) {
            this.flyable = flyable;
            return this;
        }
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder speed(int maxSpeed, int minSpeed) {
            int animalSpeed = new Random().nextInt( (maxSpeed -minSpeed)+1) + minSpeed;
            this.speed = animalSpeed;
            return this;
        }
        public Animal build(){

            return new Animal(this);
        }
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }
}
