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
public class NoMoneyState implements State{

    @Override
    public void Dispense(int amount, String product) {
        System.out.println("Insert a Coin Please");
    }
    
}
