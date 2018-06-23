/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vending_mechine;

/**
 *
 * @author SAGOR
 */
public class Vending_Mechine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Handler handler = new Handler();
        
        System.out.println("Current Mechine State: "+handler.getState().getClass().getName());
        
        handler.Dispense(20);
        
        handler.DepositandSelect(100,"pepsi");
        handler.Dispense(25);
        
        handler.DepositandSelect(25,"pepsi");
        handler.Dispense(25);
        
        handler.DepositandSelect(15,"fanta");
        handler.Dispense(30);
        
        handler.DepositandSelect(100,"pepsil");
        handler.Dispense(25);
        
    }
    
}
