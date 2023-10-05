/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c0452;

/**
 *
 * @author husna
 */
import java.util.Scanner;

public class W2ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multiplier = 7;
        int maxMultiplicand = 12;
        System.out.println("Multiplication table for " + multiplier + ":");
        for (int multiplicand = 1; multiplicand <= maxMultiplicand; multiplicand++) {
            int result = multiplier * multiplicand;
            System.out.println(multiplicand + " x " + multiplier + " = " + result);
        }

        System.out.print("Enter a number to see its multiplication table: ");
        int userMultiplier = scanner.nextInt();

        if (userMultiplier >= 1 && userMultiplier <= 12) {
            System.out.println("Multiplication table for " + userMultiplier + ":");
            for (int multiplicand = 1; multiplicand <= maxMultiplicand; multiplicand++) {
                int result = userMultiplier * multiplicand;
                System.out.println(multiplicand + " x " + userMultiplier + " = " + result);
            }
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 12.");
        }

        scanner.close();
    }
}

