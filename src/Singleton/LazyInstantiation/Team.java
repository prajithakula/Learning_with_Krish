/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Singleton.LazyInstantiation;

/**
 *
 * @author hp
 */
public class Team {
    public static void main(String[] args) {
        
        Thread t1=new Thread(new AppThreads());
        Thread t2=new Thread(new AppThreads());
        
        t1.start();
        t2.start();
        
        if(t1.equals(t2)){
           System.out.println("both Threads are same values");
       }
       else {
           System.out.println("both Threads are different values but memory instance are same.");
           
       }
    }
}
