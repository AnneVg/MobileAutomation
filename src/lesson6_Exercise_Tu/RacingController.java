package lesson6_Exercise_Tu;

import java.util.Arrays;
import java.util.List;

public class RacingController {
    //Controller
    public static Animal getMaxSpeedAnimal(List<Animal> animals) {
        Animal winner = null;
        for (Animal currentAnimal : animals) {
            System.out.println("Animals is " + currentAnimal.getClass().getSimpleName());
            System.out.println("Animals speed is " + currentAnimal.getSpeed());
            if(winner == null){
                winner = currentAnimal;

            }else {
                if(winner.getSpeed() < currentAnimal.getSpeed()){
                    winner = currentAnimal;
                }
            }

        }
        return winner;
    }

    public static void main(String[] args) {
        Animal tiger = new Tiger();
        Animal horse = new Horse();
        Animal dog = new Dog();
        Animal winner = RacingController.getMaxSpeedAnimal(Arrays.asList(tiger,horse,dog));
        System.out.println("winner is   " + winner.getClass().getSimpleName());
        System.out.println("winner speed is  " + winner.getSpeed());


    }
}
