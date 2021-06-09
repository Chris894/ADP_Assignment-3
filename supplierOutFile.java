/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2_assignment3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Chriszano Cleophas 219258341
 *  This is my own work
 */
public class supplierOutFile 
    {
    public static void main(String[] args) {
         try{
            FileInputStream fos = new FileInputStream("stakeholder.ser");
            ObjectInputStream is = new ObjectInputStream(fos);
            Supplier supplier = (Supplier) is.readObject();
            is.close();
           fos.close();
            
           FileOutputStream os = new FileOutputStream("supplier.txt");
           ObjectOutputStream oo = new ObjectOutputStream(os);
            System.out.println("===========CUSTOMERS============================");
            System.out.println("ID      Name   Product Type     Product Description");
            System.out.println("================================================");
            System.out.println(supplier.getStHolderId()    + supplier.getName()   + supplier.getProductType()   + supplier.getProductDescription());
    
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    }


