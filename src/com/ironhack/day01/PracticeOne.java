package com.ironhack.day01;

import java.util.Locale;

public class PracticeOne {
    public static void main(String[] args) {
        String word = args[0];
        int x = word.length();
        int task = Integer.valueOf(args[1]);


        if (x > 2) {
            switch (task) {
                case 1:
                    System.out.println(word.toUpperCase(Locale.ROOT));
                    break;

                case 2:
                    System.out.println(word.length());
                    break;

                case 3:
                    System.out.print(word.charAt(task - 1));
                    break;

                case 4:
                    System.out.println(word.replace('e', 'E'));
                    break;

                case 5:
                    for (int i = 0; i < 5; i++) {
                        System.out.println(word);
                    }
                    break;

                case 6:
                    for (int i = word.length() - 1; i >= 0; i--) {
                        System.out.print(word.charAt(i));
                    }
                    ;
                    break;

                default:
                    break;
            }
        } else {
            System.out.println("Das ist zu wenig");
        }
    }
}

