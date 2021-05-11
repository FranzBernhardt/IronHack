package com.ironhack.day01;

import java.time.LocalTime;

public class HelloUniverse {
    public static void main(String[] args) {

        for (int i = 0; i < Integer.valueOf(args[1]); i++) {
            if (LocalTime.now().isBefore(LocalTime.NOON)) {
                System.out.println("Guten Morgen" + " " + args[0]);
            } else {
                System.out.println("Guten Tag" + " " + args[0]);
            }
        }
    }
}
