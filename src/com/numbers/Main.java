/**
 * Java program to find numbers dividable by 3.
 */

package com.numbers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Main class.
 */
public class Main {


    // Main method to run java program.

    public static void main(String[] args) {

        // Creating a list of 27 elements and filling it wth numbers
        List<Integer> list = new ArrayList<>();

        for (int index = 0; index < 27; index++) {

            list.add(new Random().nextInt(99));

        }

        // Checking if numbers are dividable by 3 and printing result to console

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {

            // Saving value of a number to a temporal instance
            int number = it.next();

            // Condition
            if (number % 3 == 0) {

                // Printing result to console
                System.out.println(number + " is dividable by 3.");

            } else {

                System.out.println(number + " is not dividable by 3.");

            }
        }


    }
}