/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dough;

/**
 *
 * @author ASUS
 */
public class DoughPizza extends Dough{
    public double pizza;
    public double pcspizza;
    public double total; 
    
    public double hitungDoughPizza(){
        total = this.pizza/this.pcspizza;
        return total;
    }
}
