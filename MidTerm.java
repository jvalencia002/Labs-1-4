/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.term;

import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MidTerm {

            
    public static void main(String[] args) {
        int cal;
        int age;
        int year;
        int oldEnough;
        int i = 0;
        while(i<3){
        
                
        
        String Name 
                = JOptionPane.showInputDialog("Enter your name");
                
        String BirthYear 
                = JOptionPane.showInputDialog("enter your age");
        
        year = Integer.parseInt(BirthYear);
        cal = Calendar.getInstance().get(Calendar.YEAR);
        age = cal + year;
        
        System.out.println("Hello " +  Name +   " You're " +  BirthYear +  " years old today ");
        
        if (age <= 21) 
            System.out.println("You can drink legally");      
        else if (age >=21)
                System.out.println("You cannot drink!");
    
        if (age <= 21){
            oldEnough = 21 - age + cal;
            System.out.println("You will be old enough to drink" + oldEnough + ".");
            
        }
        i++;
        
            
        
        
        
           
            
        
        }
                 
        
        
       
        
        
        
        
                
        
    
        
     
 
        
        
        
        
        
    }
    
}
