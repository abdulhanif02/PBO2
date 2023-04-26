/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan260423;

/**
 *
 * @author Katsuki
 */
public class TestBank {
    public static void main (String[] args){
        Account a2 = new Account();
        Account a3 = new Account();
        
        a2.setAccountName("Hanif");
        a2.setAccountNum(123445);
        a2.setBalance(100000);
        
        a3.setAccountName("Katsuki");
        a3.setAccountNum(845692);
        a3.setBalance(500000);
        
        a2.print();
        a3.print();
    }
}
