package lesson6;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static  void maxSpeedAnimal(List<Animal> listAnimals)
    {
        int maxSpeed =0;
        int maxIndex=0;
        int animalIndex =0;
        for(Animal animal:listAnimals){
            int animalSpeed = animal.getSpeed();
            if (maxSpeed < animalSpeed){
                maxSpeed=animalSpeed;
                maxIndex = animalIndex;
            }
            animalIndex = animalIndex +1;
        }
        System.out.println("Winner is: " + listAnimals.get(maxIndex).getClass().getSimpleName() + " class and name is "
                + listAnimals.get(maxIndex).getName() + " with " + maxSpeed);

    }
    public static void main(String[] arg){

        Tiger tiger = new Tiger();
        tiger.setName("Tiger Yellow");
        tiger.run();
        Dog dog = new Dog();
        dog.setName("Happy Lucky");
        dog.run();
        Horse horse = new Horse();
        horse.setName("Black Horse");
        horse.run();
        ArrayList<Animal> listAnimals = new ArrayList<Animal>();
        listAnimals.add(tiger);
        listAnimals.add(horse);
        listAnimals.add(dog);
        maxSpeedAnimal(listAnimals);


    }
}
