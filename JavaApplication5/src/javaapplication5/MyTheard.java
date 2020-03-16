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
public class MyTheard  extends Thread  {
 
    public void run (){
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" Thread Poriority" +Thread.currentThread().getPriority());
            
            try{
            Thread.sleep(500);
            }
            catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
    }
}
