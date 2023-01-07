/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectroti;
import Dough.Doughgabungan;
import Modal.*;
/**
 *
 * @author asus
 */
public class ProjectRoti {

    public static void main(String[] args) {
      
       // HPP roti varian1
      finalhppv1 r1 = new finalhppv1();
      r1.hitungModalrotimanis();
      
      // method memanggil semua yang ada di abtract class Modal.java
      r1.tampilmodal();
      
      // HPP roti varian2
      finalhppv1 r2 = new finalhppv1();
      r2.hitungModalrotimanis2();
      
      // HPP roti varian3
      finalhppv1 r3 = new finalhppv1();
      r3.hitungModalrotimanis3();
      
      // Jumlah kebutuhan bahan sesuai pesanan
      finalhppv1 v1 = new finalhppv1();
       v1.hitungTerigu1();
        v1.hitungGula1();
        v1.hitungButter1();
        v1.hitungRagi1();
        v1.hitungSusuBubuk1();
        v1.hitungSusuCair1();
        v1.hitungTelur1();
        v1.hitungEs1();
        v1.hitungCoklat1();
        v1.hitungKeju1();
        v1.hitungRedbean1();
        v1.hitungSosis1();
        
        // Jumlah kue per satu dough
      Doughgabungan l1 = new Doughgabungan();
      l1.rotimanis=2350;
      l1.pcsrotimanis=50;
      l1.tampil();
      
        finalhppv1 v2 = new finalhppv1();
        v2.hitungPesanan1();
        
        finalhppv1 v3 = new finalhppv1(); 
        v3.hitungPesanan1();
        
        finalhppv1 v4 = new finalhppv1();
        v4.hitungPesanan1(); 
      
        //Roti Tawar
       // HPP Roti Tawar Varian 1
      finalhppv1 t1 = new finalhppv1();
      t1.hitungModalrotitawar1();
      
      // HPP Roti Tawar Varian 2
      finalhppv1 t2 = new finalhppv1();
      t2.hitungModalrotitawar2();

      // Jumlah kebutuhan bahan sesuai pesanan
      finalhppv1 t = new finalhppv1();
        t.hitungTerigurotitawar();
        t.hitungGularotitawar();
        t.hitungButterrotitawar();
        t.hitungRagirotitawar();
        t.hitungSusuBubukrotitawar();
        t.hitungSusuCairrotitawar();
        t.hitungTelurrotitawar();
        t.hitungEsrotitawar();
        t.hitungCoklatrotitawar();
        t.hitungKejurotitawar();  
      
      // Jumlah Roti Per Satu Dough
      Doughgabungan tw = new Doughgabungan();
      tw.rotitawar=2065;
      tw.pcsrotitawar=400;
      tw.tampil3();
      
      finalhppv1 w1 = new finalhppv1();
        w1.hitungPesananrotitawar1();
        
        finalhppv1 w2 = new finalhppv1(); 
        w2.hitungPesananrotitawar2();

    // End of Roti Tawar
   
    
    
        //Pizza
       // HPP Pizza
       finalhppv1 h1 = new finalhppv1();
      h1.hitungModalPizza();
      
      // Method memanggil semua yang ada di abtract class Modal.java
      // Jumlah kebutuhan bahan sesuai pesanan
      finalhppv1 X = new finalhppv1();
        X.hitungTeriguX();
        X.hitungGulaX();
        X.hitungButterX();
        X.hitungRagiX();
        X.hitungSusuBubukX();
        X.hitungSusuCairX();
        X.hitungTelurX();
        X.hitungEsX();
        X.hitungKejuX();
        X.hitungSosisX();
        X.hitungSmokeBeefX();
        X.hitungBawangBombayX();
        
     X.hitungPesananPizza();
      
      Doughgabungan I = new Doughgabungan();
      I.pizza=1950;
      I.pcspizza=190;
      I.tampil2();
      
       
    }
}
