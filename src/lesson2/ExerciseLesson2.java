package lesson2;

import java.util.Scanner;
import java.math.*;

public class ExerciseLesson2 {
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number to calculate factorial:");
        int number = scanner.nextInt();
        int result = 1;
        for (int startIndex = 1; startIndex <= number; startIndex++) {
            result = result * startIndex;
          //  System.out.println(startIndex);
        }
        System.out.printf("factorial of %d is %d", number, result);

    }
    public static void averageOfArray(int[] array) {
        int sum, lengthArray;
        sum = 0;
        lengthArray = array.length;
        if (lengthArray != 0){

            for (int startIndex = 0; startIndex < lengthArray; startIndex++){
                sum = sum + array[startIndex];
            }
            System.out.printf("\nAverage of Array is: %.2f ", (float)sum / lengthArray);
        }else{
            System.out.println("No number in array");
        }
    }
    public static void maxNumberArray(int[] array){
        int maxNumber, lengthArray;
        maxNumber=0;
        lengthArray=array.length;

        if (lengthArray!=0){
            for(int startIndex =0;startIndex< lengthArray;startIndex++){
                if(maxNumber < array[startIndex]){
                    maxNumber=array[startIndex];
                }
            }
            System.out.printf("\nMax number in array is: %d", maxNumber);
        }

    }
    public static void orderNumberArray(int[] array){
        int lengthArray=array.length;
        if (lengthArray!=0){
            for(int i=0; i<lengthArray-1;i++){
                if(array[i]>array[i+1]){
                    int temp=0;
                    temp=array[i+1];
                    array[i+1]=array[i];
                    array[i]=temp;
                    i =-1;
                }
            }
            System.out.print("\nThe Array after order is:");
            for(int i=0; i<lengthArray;i++){

                System.out.print(array[i]+",");
            }

        }
    }
    public static void checkPrimeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease input a number to check:");
        int inputNumber = scanner.nextInt();
        boolean isPrime=true;
        if(inputNumber<2){
            isPrime = false;
        }else
        {
            for(int startIndex=2; startIndex<=inputNumber/2; startIndex++){
                int temp = inputNumber%startIndex;
                if(inputNumber%startIndex==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if (isPrime==true) {
            System.out.printf("%d is prime number", inputNumber);
        }
        else {
            System.out.printf("%d is not a prime number", inputNumber);
        }

    }
    public static void main(String[] arg) {
        int[] array = {8, 72, 36, 49, 85, 96, 17,7};
        factorial();
        averageOfArray(array);
        maxNumberArray(array);
        orderNumberArray(array);
        checkPrimeNumber();

    }
}


