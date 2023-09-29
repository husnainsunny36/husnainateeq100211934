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

public class W1ex5 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter first Integer:");
        int FirstNumber = number.nextInt();
        System.out.print("Enter second Integer:");
        int SecondNumber = number.nextInt();
        System.out.println("Original order:" + FirstNumber + "," + SecondNumber);
        int temp = FirstNumber;
        FirstNumber = SecondNumber;
        SecondNumber = temp;
        System.out.println("Swapped:" +FirstNumber + "," + SecondNumber);
    }
}

