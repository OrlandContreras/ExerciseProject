/**
 * Create a new Java project and try modeling a domain you’re comfortable with. It could be
 * something like: Sports, Business, Mathematics, Online Shopping, etc. For example, if you
 * modeled online shopping, you might create classes to represent: Customer, Product, Order,
 * etc. These classes would likely have properties and you may think of a few methods that
 * might make sense for them too. There is no example code for this.
 * **/

package com.exercises.domain.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Initial {
    public static void main(String[] args) throws IOException {
        int terminate;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        do{
            System.out.println("Selection Talent Program. Welcome!");
            System.out.println("1 - Create Work Offer");
            System.out.println("2 - Apply Work Offer");
            System.out.println("0 - Exit");
            terminate = Integer.parseInt(reader.readLine());
            switch (terminate) {
                case 1 -> createWorkOffer();
                case 2 -> applyWorkOffer();
                default -> terminate = 0;
            }
        }while(terminate != 0);


    }

    private static void applyWorkOffer() {
        // TODO: Codify method
    }

    private static void createWorkOffer() {
        // TODO: Codify method
    }
}
