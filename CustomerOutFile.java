/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 *and open the template in the editor.

 */

package za.ac.cput.adp2_assignment3;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.Calendar;

/**
 *
 * @author Chriszano Cleophas 219258341
 * This is my own work
 */
public class CustomerOutFile {
    public static void main(String[] args)  {
        try{
            FileInputStream fis = new FileInputStream("stakeholder.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Customer customer = (Customer) ois.readObject();
            
            ois.close();
            fis.close();
            
            Calendar today = Calendar.getInstance();
 
            int curYear = today.get(Calendar.YEAR);
            String dobYear = customer.getDateOfBirth();
 
             FileOutputStream f = new FileOutputStream("customer.txt");
           ObjectOutputStream o = new ObjectOutputStream(f);
 
            
            System.out.println("===========CUSTOMERS============================");
            System.out.println("ID      Name    Surname     Date of Birth   Age");
            System.out.println("================================================");
            System.out.println(customer.getStHolderId()    + customer.getFirstName()   + customer.getSurName()   + customer.getDateOfBirth());
           
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
