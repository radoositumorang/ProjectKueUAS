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
public abstract class Dough {
    public abstract double hitungDoughrotitawar();
    public void tampil(){
        System.out.println("Dalam satu adonan dapat membuat : " + this.hitungDoughrotitawar());
    }
}
