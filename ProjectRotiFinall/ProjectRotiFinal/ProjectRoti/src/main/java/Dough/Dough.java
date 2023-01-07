/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dough;

/**
 *
 * @author asus
 */
public abstract class Dough {
    public abstract double hitungDoughrotimanis();
    public abstract double hitungDoughrotitawar();
    public abstract double hitungDoughPizza();
    public void tampil(){
        System.out.println("Dalam satu adonan dapat membuat : " + Math.round(this.hitungDoughrotimanis()) + "Roti Manis");
    }
    public void tampil3(){
        System.out.println("Dalam satu adonan dapat membuat : " + Math.round(this.hitungDoughrotitawar()) + "Roti Tawar");
    }
    public void tampil2(){
        System.out.println("Dalam satu adonan dapat membuat : " + Math.round(this.hitungDoughPizza()) + "Pizza");
    }

}

