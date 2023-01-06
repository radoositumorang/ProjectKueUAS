/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpizza;
import Dough.*;
import Modal.*;

/**
 *
 * @author ASUS
 */
public class ProjectPizza {

    public static void main(String[] args) {
        // Jumlah pizza per satu dough
      DoughPizza I = new DoughPizza();
      I.pizza=1950;
      I.pcspizza=190;
      I.tampil();
      
       // HPP Pizza
      FinalHppPizza h1 = new FinalHppPizza();
      h1.hitungModalPizza();
      
      // Method memanggil semua yang ada di abtract class Modal.java
      h1.tampilmodal();
      
      // Jumlah kebutuhan bahan sesuai pesanan
      FinalHppPizza X = new FinalHppPizza();
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
    }
    
}
