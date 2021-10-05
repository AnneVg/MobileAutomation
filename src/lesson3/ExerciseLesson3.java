package lesson3;

import java.lang.String;
import java.util.Scanner;

public class ExerciseLesson3 {
    //Exercise 1
    public static void calMinutesInString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the string as format (X)hrs and (Y) minutes");
        String inputString = scanner.nextLine();
        int indexHrs = inputString.indexOf("hrs");
        int indexCharD = inputString.indexOf("d");
        int indexMinutes = inputString.indexOf("minutes") - 1;
        int numberHour = Integer.parseInt(inputString.substring(0, indexHrs));
        int minutes = Integer.parseInt(inputString.substring(indexCharD + 2, indexMinutes));
        if (numberHour >= 0 && minutes > 0) {
            System.out.println("Total minutes in String is: " + (numberHour * 60 + minutes));
        } else {
            System.out.println("Please check your input correct or not!");
        }
    }
    //Exercise 2
    public static void checkPassword() {
        String correctPassword = "password123";
        int numberInput = 1;
        do {
            System.out.println("please input your password");
            Scanner scanner = new Scanner(System.in);
            String inputUserPassword = scanner.nextLine();
            if (correctPassword.equals(inputUserPassword)) {
                System.out.println("Your password is correct!");
                break;
            } else {
                numberInput++;
            }

        } while (numberInput <= 3);
        if (numberInput > 3)
            System.out.println("Sorry You reach out 3 times input password! Please try again after 1 hour");

    }
    //Exercise 3
    public static void findNumberInString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input a string");
        String userString = scanner.nextLine();
        String numberInString = " ";
        char[] userCharacters = userString.toCharArray();
        for (char character : userCharacters) {
            if (Character.isDigit(character)) {
                numberInString = numberInString + character;
            }
        }
        System.out.println("Number in String is: " + Integer.parseInt(numberInString.trim()));

    }
    //Exercise 4
    public static void checkProtocolAndDomainName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a valid URL");
        String URL = scanner.nextLine();
        String[] domainName = URL.split("[://,.]+");
        for (String s : domainName) {
            System.out.println(s);

        }
        switch (domainName[0]) {
            case "http":
                System.out.println("the protocol is http");
                break;
            case "https":
                System.out.println("the protocol is https");
                break;
            default:
                System.out.println("invalid protocol");

        }
        System.out.println("Name site is: " + domainName[1]);
        switch (domainName[2]) {
            case "com":
                System.out.println("the domain extension is .com");
                break;
            case "net":
                System.out.println("the domain extension is .net");
                break;
            default:
                System.out.println("the domain extension is not .com or .net");

        }

    }

    public static void main(String[] arg) {
        calMinutesInString();
        checkPassword();
        findNumberInString();
        checkProtocolAndDomainName();
    }
}
