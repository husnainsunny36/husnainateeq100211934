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
import java.util.Calendar;

public class W2ex1 {
    public static void main(String[] args) {
        Scanner birth = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = birth.nextInt();
        if(age>=18)
        {
            System.out.println("yes you are old enough");
        }
        else
        {
            System.out.println("You aren't old enough");
        }
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int birthyear = currentYear-age;
        System.out.println("You were born in the year" +  birthyear);
    }
}
