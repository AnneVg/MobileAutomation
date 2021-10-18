package lesson7_1;

import java.util.Arrays;
import java.util.List;

public class RacingController {
    public static Animal getMaxSpeedAnimal(List<Animal> animals) {
        Animal winner = null;
        for (Animal currentAnimal : animals) {
            System.out.println("Animals is " + currentAnimal.getName());
            System.out.println("Animals speed is " + currentAnimal.getSpeed());
            if(winner == null && currentAnimal.isFlyable()==false ){
                winner = currentAnimal;

            }else {
                if((winner.getSpeed() < currentAnimal.getSpeed()) && currentAnimal.isFlyable()==false){
                    winner = currentAnimal;
                }
            }

        }
        return winner;
    }

    public static void main(String[] args) {
        Animal tiger = new Animal.Builder().name("Tiger Yellow").canFly(false).speed(100,20).build();
        Animal horse = new Animal.Builder().name("horse black").canFly(false).speed(80,30).build();
        Animal dog = new Animal.Builder().name("dog lulu").canFly(false).speed(50,20).build();
        Animal bird = new Animal.Builder().name("angry bird").canFly(true).speed(80,30).build();
        Animal winner = RacingController.getMaxSpeedAnimal(Arrays.asList(tiger,horse,dog));
        System.out.println("winner is   " + winner.getName());
        System.out.println("winner speed is  " + winner.getSpeed());
    }
}
