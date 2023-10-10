/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c0452;

/**
 *
 * @author husna
 */
public class Course {
   private String courseCode;
   private String courseName;
   
   public Course () {
       courseCode = "CO452";
       courseName = "Programming Concepts";
       
   }
   public static void main(String[] args){
           Course mycourseCode = new Course();
           Course mycourseName = new Course();
           System.out.println("My Course code is:"+mycourseCode.courseCode);
           System.out.println("My Course name is:"+mycourseName.courseName);
           
    }
   }
