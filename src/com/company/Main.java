package com.company;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner kbReader = new Scanner(System.in);
        System.out.println("Which operation would you like to perform?");
        String operation = kbReader.nextLine();
        System.out.println("1st Number:");
        int firstNumber = kbReader.nextInt();
        System.out.println("2nd Number:");
        int secondNumber = kbReader.nextInt();
        boolean correctGuess = false;
        String answer = "log";

        if (operation == "addition") {
            double equationA = Math.log(firstNumber + secondNumber);
            System.out.println("The sum of " + firstNumber + " and " + secondNumber + "= " + equationA);
            while (!correctGuess) {
                System.out.println("Are you satisfied?");
                String response = kbReader.nextLine();
                if (response == "yes") {
                    System.out.println("You have been misinformed");
                } else if (response == "no") {
                    System.out.println("What happened to the equation?");
                    String responseB = kbReader.nextLine();
                    if (responseB == answer) {
                        System.out.println("Good Job!");
                    } else {
                        System.out.println("Nope! Keep on trying!");
                    }
                }
            }
        } else if (operation == "subtraction") {
            double equationB = Math.log(firstNumber - secondNumber);
            System.out.println("The subtraction of " + firstNumber + " and " + secondNumber + "= " + equationB);
            while (!correctGuess) {
                System.out.println("Are you satisfied?");
                String response = kbReader.nextLine();
                if (response == "yes") {
                    System.out.println("You have been misinformed");
                } else if (response == "no") {
                    System.out.println("What happened to the equation?");
                    String responseB = kbReader.nextLine();
                    if (responseB == answer) {
                        System.out.println("Good Job!");
                    } else {
                        System.out.println("Nope! Keep on trying!");
                    }
                }
            } if (operation == "multiplication") {
                double equationC = Math.log(firstNumber * secondNumber);
                System.out.println("The multiplication of " + firstNumber + " and " + secondNumber + "= " + equationC);

                while (!correctGuess) {
                    System.out.println("Are you satisfied?");
                    String response = kbReader.nextLine();
                    if (response == "yes") {
                        System.out.println("You have been misinformed");
                    } else if (response == "no") {
                        System.out.println("What happened to the equation?");
                        String responseB = kbReader.nextLine();
                        if (responseB == answer) {
                            System.out.println("Good Job!");
                        } else {
                            System.out.println("Nope! Keep on trying!");
                        }
                    }
                } if (operation == "division") {
                    double equationD = Math.log(firstNumber / secondNumber);
                    System.out.println("The division of " + firstNumber + " and " + secondNumber + "= " + equationD);
                    while (!correctGuess) {
                        System.out.println("Are you satisfied?");
                        String response = kbReader.nextLine();
                        if (response == "yes") {
                            System.out.println("You have been misinformed");
                        } else if (response == "no") {
                            System.out.println("What happened to the equation?");
                            String responseB = kbReader.nextLine();
                            if (responseB == answer) {
                                System.out.println("Good Job!");
                            } else {
                                System.out.println("Nope! Keep on trying!");
                            }
                        }
                    }

                }
            }
        }
    }
}