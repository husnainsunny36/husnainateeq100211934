/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c0452;

/**
 *
 * @author husna
 */
public class Student {
   private int studentid;
   private String studentname;
   
   //constructor
   
   public Student (int id, String name){
   studentid = id;
   studentname =name;
   }
   public static void main(String[] args) {
   Student myID = new Student(100211934,"ID:");
   Student myName = new Student(0, "Husnain");
   System.out.println("My ID is:"+myID.studentid);
   System.out.println("My Name is:"+myName.studentname);

       
   }
}
