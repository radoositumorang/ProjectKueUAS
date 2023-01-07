/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectTawar;
import Dough.*;
import Modal.*;

/**
 *
 * @author ASUS
 */
public class ProjectTawar {
 //Roti Tawar
       // HPP Roti Tawar Varian 1
       FinalHppv1 t1 = new FinalHppv1();
       t1.hitungModalrotitawar1();
       
       // HPP Roti Tawar Varian 2
       FinalHppv1 t2 = new FinalHppv1();
       t2.hitungModalrotitawar2();
 
       // Jumlah kebutuhan bahan sesuai pesanan
       FinalHppv1 t = new FinalHppv1();
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
       DoughTawar tw = new DoughTawar();
       tw.tawar=2065;
       tw.pcstawar=400;
       tw.tampil();
       
       FinalHppv1 w1 = new FinalHppv1();
         w1.hitungPesananrotitawar1();
         
         FinalHppv1 w2 = new FinalHppv1(); 
         w2.hitungPesananrotitawar2();
 
     // End of Roti Tawar
    
}
    

