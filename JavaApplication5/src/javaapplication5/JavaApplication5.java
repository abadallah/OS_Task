/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Abdallah
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MyTheard Thread1 =new MyTheard();
        MyTheard Thread2 =new MyTheard();
        MyTheard Thread3 =new MyTheard();

         Thread1.setPriority(2); 
        Thread2.setPriority(5); 
        Thread3.setPriority(8); 
        
        Thread1.start();
        Thread2.start();
        Thread3.start();
    }
    
}
