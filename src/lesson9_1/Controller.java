package lesson9_1;

import java.util.*;

public class Controller {
    public static Animal race(List<Animal> animals) {
        Animal winner = null;
        for (Animal currentAnimal : animals) {
            System.out.println("current animal type is: " + currentAnimal.getTypeAnimal() + " with speed " + currentAnimal.getSpeed());
            if (winner == null) {
                winner = currentAnimal;
            } else {
                if ((winner.getSpeed() < currentAnimal.getSpeed())) {
                    winner = currentAnimal;
                }
            }

        }

        return winner;

    }

    public static void main(String[] args) {
        int countWinnerTiger = 0;
        int countWinnerHorse = 0;
        int countWinnerElephant = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Start Race:" + i);
            ArrayList<Animal> animals = new ArrayList<Animal>();
            Tiger tiger1 = new Tiger();
            Tiger tiger2 = new Tiger();
            Horse horse1 = new Horse();
            Horse horse2 = new Horse();
            Elephant elephant1 = new Elephant();
            Elephant elephant2 = new Elephant();
            animals.add(tiger1);
            animals.add(tiger2);
            animals.add(horse1);
            animals.add(horse2);
            animals.add(elephant1);
            animals.add(elephant2);
            Animal winner = race(animals);
            System.out.println("The winner round " + i + " " + winner.getTypeAnimal() + " with speed " + winner.getSpeed());
            switch (winner.getTypeAnimal()) {
                case "Tiger":
                    countWinnerTiger++;
                    break;
                case "Horse":
                    countWinnerHorse++;
                    break;
                case "Elephant":
                    countWinnerElephant++;
                    break;
            }

        }
        System.out.println("Count number win Tiger: " + countWinnerTiger);
        System.out.println("Count number win Horse: " + countWinnerHorse);
        System.out.println("Count number win Elephant: " + countWinnerElephant);
        if(countWinnerTiger > countWinnerHorse && countWinnerTiger > countWinnerElephant){
            System.out.println("The winner is Tiger");
        }
        else if (countWinnerHorse > countWinnerTiger && countWinnerHorse > countWinnerElephant) {
            System.out.println("The winner is Horse");
        }  else if (countWinnerElephant > countWinnerTiger && countWinnerElephant > countWinnerHorse) {
            System.out.println("The winner is Elephant");
        }


    }

}
