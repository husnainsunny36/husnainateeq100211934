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
class Rectangle {
    public static void main(String[] args) {
    Scanner value = new Scanner(System.in);
    System.out.print("What is the length of rectangle?:");
    int length = value.nextInt();
    System.out.print("What is the height of rectangle?:");
    int height = value.nextInt();
    
    int perimetre = 2*(length+height);
    int area = length*height;
        System.out.println("Perimetre of Rectangle is:" + perimetre);
        System.out.println("Area of Rectangle is:" + area);    
    }
}

