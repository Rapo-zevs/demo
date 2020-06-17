/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication36;

/**
 *
 * @author User
 */
public class container <T extends Number>{
    private T object;

    container(T user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public T doItAndReturn(){
        System.out.println("I did it");
        return this.object;
    }
    
}
