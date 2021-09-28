package lesson1;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class SimpleProgram {
    public static void main(String[] arg)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int inputNumber = scanner.nextInt();
      boolean isEvenNumber = (inputNumber % 2 == 0);
        if(isEvenNumber){
            System.out.printf("The number is a even number " + inputNumber);
        }
        else {
            System.out.printf("the number %d is a odd number ",inputNumber);

        }
        System.out.println("See you next time!");

    }
}
