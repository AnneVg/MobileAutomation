package lesson1;

import java.util.Scanner;

public class ExerciseLesson1 {
    public static void main(String[] arg){
        int firstNumber, secondNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the first number:");
        firstNumber = scanner.nextInt();
        System.out.println("please input the second number:");
        secondNumber = scanner.nextInt();
        System.out.printf("Multiplication: %d * %d = %d", firstNumber, secondNumber, firstNumber*secondNumber);
        System.out.printf("\n Summation: %d + %d = %d", firstNumber, secondNumber, firstNumber+secondNumber);
        if (secondNumber!=0) {
            System.out.printf("\n Division: %d / %d = %d", firstNumber, secondNumber, firstNumber/secondNumber);
        }else{
            System.out.println("\n Division: Can not be devided by zero");
        }
        if(firstNumber >= secondNumber){
            System.out.printf("\n Subtraction: %d - %d = %d", firstNumber, secondNumber, firstNumber-secondNumber);
        }else{
            System.out.printf("\n Subtraction: %d - %d = %d", secondNumber,firstNumber, secondNumber- firstNumber);

        }









    }
}
