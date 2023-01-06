/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectroti;
import Dough.Doughrotimanis;
import Modal.*;
/**
 *
 * @author asus
 */
public class ProjectRoti {

    public static void main(String[] args) {
      // Jumlah kue per satu dough
      Doughrotimanis l1 = new Doughrotimanis();
      l1.rotimanis=2350;
      l1.pcsrotimanis=50;
      l1.tampil();
      
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
        
        finalhppv1 v2 = new finalhppv1();
        v2.hitungPesanan1();
        
        finalhppv1 v3 = new finalhppv1(); 
        v3.hitungPesanan1();
        
        finalhppv1 v4 = new finalhppv1();
        v4.hitungPesanan1(); 
      
       
    }
}
