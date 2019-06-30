/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2019;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class User {
    Scanner input = new Scanner(System.in);
    private String Fname;
    private String Lname;
    private int Bdate;
    
    
    
    User(){
        System.out.println("First Name:");
        this.Fname = input.next();
        System.out.println("Last Name: ");
        this.Lname = input.next();
        System.out.println("Birth Date: ");
        this.Bdate = input.nextInt();
  
 }   
    
    public String toString(){
    
        return "Nmae: " + Fname + " " + Lname + "\n"
                + "Birth Date: " + Bdate; 
    }
    
    
    
}


