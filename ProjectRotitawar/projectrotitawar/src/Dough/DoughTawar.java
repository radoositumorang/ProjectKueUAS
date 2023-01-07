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
public class DoughTawar extends Dough{
    public double tawar;
    public double pcstawar;
    public double total; 
    
    public double hitungDoughrotitawar(){
        total = this.tawar/this.pcstawar;
        return total;
    }
}
