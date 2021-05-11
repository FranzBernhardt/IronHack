package com.ironhack.day02;

import java.util.Random;
import java.util.Scanner;

public class RateMalZahl {
    public static void main(String[] args) {

        int tryOut = 0;
        int num;

        Random generator = new Random();
        int randomNum = 1 + generator.nextInt(50);
        boolean isRight = false;


        while (isRight == false) {

            System.out.println("Enter a number between 1 and 50: ");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();

            tryOut = tryOut + 1;


            if (num == randomNum) {
                isRight = true;
                System.out.println("very good, you tip the right number in " + tryOut + " tryouts");
            } else {
                if (num > randomNum) {
                    System.out.println("Sorry the right Number is less than yours :( Try again!");
                } else {
                    System.out.println("Sorry the right Number is bigger than yours :( Try again!");
                }
            }

        }
    }
    // Test gitHub
}
