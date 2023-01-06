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
    public void tampil(){
        System.out.println("Dalam satu adonan dapat membuat : " + this.hitungDoughrotimanis());
    }

}

