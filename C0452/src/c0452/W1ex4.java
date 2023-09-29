/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c0452;

/**
 *
 * @author 100211934
 */
import java.util.Scanner;
public class W1ex4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter first number:");
        int Number1 = number.nextInt();
        System.out.print("Enter second number:");
        int Number2 = number.nextInt();
         double Average = (Number1+Number2) / 2.0;
        System.out.println("Average of " + Number1 + " and " + Number2 + " is:" + Average);
    }
}

