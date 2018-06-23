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
public class HasMoneyState implements State{

    @Override
    public void Dispense(int amount, String product, int price) {
        int n;
       if(amount==price){
           System.out.println("Product delivered with no change");
       }
       else if(amount>price){
           n = amount-price ;
           System.out.println("Product delivered with change: "+n);
       }
       else if(amount<price){
           System.out.println("Product not delivered due to insufficient deposit");
       }
       if(amount<0 || price<0 || product==""){
           System.out.println("Product not delivered due to inventory depletion");
       }
    }
    
}
