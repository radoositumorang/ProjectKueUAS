/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dough;

/**
 *
 * @author asus
 */
public class Doughgabungan extends Dough {
    public double rotimanis;
    public double pcsrotimanis;
    public double total;
    
    public double rotitawar;
    public double pcsrotitawar;
    public double total3;
    
    public double pizza;
    public double pcspizza;
    public double total2; 
    
    
    public double hitungDoughrotimanis(){
        total = this.rotimanis/this.pcsrotimanis;
        return total;
    }

    public double hitungDoughrotitawar(){
        total3 = this.rotitawar/this.pcsrotitawar;
        return total3;
    }
    
    public double hitungDoughPizza(){
        total2 = this.pizza/this.pcspizza;
        return total2;
    }


  
    
    
   
}
