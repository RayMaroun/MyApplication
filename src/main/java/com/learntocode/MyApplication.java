package com.learntocode;

import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = getName(scanner);
        int age = getAge(scanner);

        printNameAndAge(name, age);

        printVotingEligibility(age);

        printMessage(name, age);

        printWelcomeMessage(name);

        printDrinkingEligibility(name, age);

        double number = getNumber(scanner);

        double squareRoot = calculateSquareRoot(number);

        System.out.println("The square root of " + number + " is " + squareRoot);

        int firstNumber = getFirstNumber(scanner);
        int secondNumber = getSecondNumber(scanner);
        boolean isGreaterThan = isGreaterThan(firstNumber, secondNumber);
        System.out.println(firstNumber + " is greater than " + secondNumber + ": " + isGreaterThan);

        String welcomeMessage = name.equalsIgnoreCase("Eve") ? "You are not welcome " + name : "You are welcome " + name;
        System.out.println(welcomeMessage);

        double num1 = 5.6;
        double num2 = 3.2;
        double maxNum = getMax(num1,num2);
        System.out.println("The maximum is: " + maxNum);

        int randomNum = generateRandomNumber();
        System.out.println("Random number between 1 and 10: " + randomNum);

        double number1 = 5;
        double number2 = 10;
        double minNum = getSmallerNumber(number1,number2);
        System.out.println("The smaller number is: " + minNum);
        /*int num1 = getFirstNumber(scanner);
        int num2 = getSecondNumber(scanner);
        isGreaterThan(num1,num2);*/
    }

/*    public static int getFirstNumber(Scanner scanner) {
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        return num1;
    }

    public static int getSecondNumber(Scanner scanner) {
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        return num2;
    }

    public static void isGreaterThan(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is the larger number.");
        } else if (num1 < num2) {
            System.out.println(num2 + " is the larger number.");
        } else {
            System.out.println("This numbers are equal.");
        }
    }*/

    public static int generateRandomNumber(){
        int min = 1;
        int max = 10;
        int randomNumber = (int)(Math.random() * ((max - min) + 1)) + min;
        return randomNumber;
    }

    public static double getSmallerNumber(double num1,double num2){
        double smallerNumber = Math.min(num1,num2);
        return smallerNumber;
    }

    public static double getMax(double num1, double num2){
        double maximumNumber =  Math.max(num1,num2);
        return maximumNumber;
    }

    public static int getFirstNumber(Scanner scanner) {
        System.out.println("Enter the first number:");
        return scanner.nextInt();
    }

    public static int getSecondNumber(Scanner scanner) {
        System.out.println("Enter the second number:");
        return scanner.nextInt();
    }

    public static boolean isGreaterThan(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber;
    }

    public static double getNumber(Scanner scanner) {
        System.out.println("Enter a number: ");
        double num = scanner.nextDouble();
        return num;
    }

    public static double calculateSquareRoot(double nums) {
        return Math.sqrt(nums);
    }

    public static void printDrinkingEligibility(String name, int age) {
        if (name.equalsIgnoreCase("Bob") && age >= 21) {
            System.out.println("You are old enough to drink!");
        } else {
            System.out.println("You are not old enough to drink!");
        }
    }

    public static void printWelcomeMessage(String name) {
/*        if(name.equalsIgnoreCase("Alice")) {
            System.out.println("Welcome Alice!");
        } else {
            System.out.println("Hello Stranger!");
        }*/

        switch (name.toLowerCase()) {
            case "alice":
                System.out.println("Welcome Alice!");
                break;
            case "bob":
                System.out.println("Hey Bob do you want to grab a drink?");
                break;
            default:
                System.out.println("hello Stranger!");
                break;
        }
    }

    public static void printNameAndAge(String name, int age) {
        System.out.println("Username: " + name);
        System.out.println("Age: " + age);
    }

    public static void printVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("You are old enough to vote!");
        } else {
            System.out.println("You are not old enough to vote!");
        }
    }

    public static String getName(Scanner scanner) {
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        return name;
    }

    public static int getAge(Scanner scanner) {
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        return age;
    }

    public static void printMessage(String myname, int myage) {
        System.out.println("Hello " + myname + "! You are " + myage + " years old.");
    }
}
