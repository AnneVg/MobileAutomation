package lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller {
// Can add one function runContest then handling filter animals and also finding the winner, after that using it in Main
  /*  public static Animal runContest(List<Animal> animals){
        List<Animal> runAnimals = applicableAnimals(animals);
        Animal winner = getMaxSpeedAnimal(runAnimals);
        return winner;

    }*/

   public static Animal getMaxSpeedAnimal(List<Animal> animals) {
        Animal winner = null;
        for (Animal currentAnimal : animals) {
            System.out.printf("Animal type is %s with speed %.2f \n", currentAnimal.getTypeAnimal(),currentAnimal.speed());
            if (winner == null) {
                winner = currentAnimal;
            } else {
                if ((winner.speed() < currentAnimal.speed())) {
                    winner = currentAnimal;
                }
            }

        }
        return winner;
    }

    private static double generateSpeed(double maxSpeed, double minSpeed) {
        return minSpeed + (maxSpeed - minSpeed) * new Random().nextDouble();
    }

    private static List<Animal> applicableAnimals(List<Animal> animals) {
        List<Animal> runAnimals = new ArrayList<Animal>();
        for(Animal animal: animals){
            if(animal.flyable()==false){
                runAnimals.add(animal);
            }
        }
        return runAnimals;

    }

    public static void main(String[] args) {
        Animal tiger = new Animal("tiger", false, generateSpeed(100, 30));
        Animal cat = new Animal("cat", false, generateSpeed(30, 5));
        Animal dog = new Animal("dog", false, generateSpeed(40, 5));
        Animal horse = new Animal("horse", false, generateSpeed(80, 40));
        Animal eagle = new Animal("eagle", true, generateSpeed(150, 30));
        Animal falcon = new Animal("falcon", true, generateSpeed(200, 50));
        Animal squirrel = new Animal("squirrel", false, generateSpeed(15, 5));
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(tiger);
        animals.add(cat);
        animals.add(dog);
        animals.add(horse);
        animals.add(eagle);
        animals.add(falcon);
        animals.add(squirrel);
        for (Animal applicableAnimal : applicableAnimals(animals)){
            System.out.println("Animal type:"+ applicableAnimal.getTypeAnimal());
        }
        Animal winner = getMaxSpeedAnimal(applicableAnimals(animals));
        System.out.printf("Winner is %s with speed %.2f", winner.getTypeAnimal(), winner.speed());

    }
}
