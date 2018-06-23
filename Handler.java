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
public class Handler {
    State VenderState ;
    int amount;
    String Product;
    public Handler(){
        VenderState = new NoMoneyState();
        amount = 0;
        Product = "";
    }
    public void setState(State tmpst){
        VenderState = tmpst;
    }
    
    State getState(){
        return VenderState ;
    }
    
    void DepositandSelect(int amnt, String prdct){
        amount = amnt;
        Product = prdct;
        if(amount>0) VenderState = new HasMoneyState();
    }
    
    void Dispense(int price){
        VenderState.Dispense(amount, Product,price);
        amount = 0;
        Product = "";
        VenderState = new NoMoneyState();
    }
}
