/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

/**
 *
 * @author ASUS
 */
public class FinalHppv1 extends Modal{
    
    //Berat kemasan dough (gram)
    public int kemasanTepung = 1000;
    public int kemasanGulaPasir = 1000;
    public int kemasanButter = 500;
    public int kemasanRagi = 11;
    public int kemasanSusuBubuk = 1000;
    public int kemasanSusuCair = 1000;
    public int kemasanTelur = 1000;
    public int kemasanEsBatu = 1000;
    public int kemasanKeju = 250;
    public int kemasanCoklat = 500;
    
    //Harga setiap bahan (rupiah)
    public int tepungTerigu = 40000;
    public int gulaPasir = 25000;
    public int butter = 23000;
    public int ragi = 5000;
    public int susuBubuk = 39000;
    public int susuCair = 24000;
    public int telur = 23000;
    public int esBatu = 2000;
    public int keju = 31000;
    public int Coklat = 29000;

    //Roti Tawar
    public double totalhpprotitawar;
    public double totalperpcsrotitawar;
    public double totalpesananrotitawar;
    public int beratTepungrotitawar = 1000;
    public int beratGulaPasirrotitawar = 125;
    public int beratButterrotitawar = 100;
    public int beratRagirotitawar = 20;
    public int beratSusuBubukrotitawar = 250;
    public int beratSusuCairrotitawar = 200;
    public int beratTelurrotitawar = 70;
    public int beratEsBaturotitawar = 300;
    public int beratKejurotitawar = 80;
    public int beratCoklatrotitawar = 80;


   //Roti tawar
    //Mencari HPP Satu Adonan Roti Tawar
    
    public double hitungTerigurotitawar(){
        double hitung = this.tepungTerigu / this.kemasanTepung * this.beratTepungrotitawar;
        return hitung;
    }
    

    public double hitungGularotitawar() {
        double hitung = this.gulaPasir / this.kemasanGulaPasir * this.beratGulaPasirrotitawar;
        return hitung;
    }

    public double hitungButterrotitawar() {
        double hitung = this.butter / this.kemasanButter * this.beratButterrotitawar;
        return hitung;
    }

    public double hitungRagirotitawar() {
        double hitung = this.ragi / this.kemasanRagi * this.beratRagirotitawar;
        return hitung;
    }

    public double hitungSusuBubukrotitawar() {
        double hitung = this.susuBubuk / this.kemasanSusuBubuk * this.beratSusuBubukrotitawar;
        return hitung;
    }

    public double hitungSusuCairrotitawar() {
        double hitung = this.susuCair / this.kemasanSusuCair * this.beratSusuCairrotitawar;
        return hitung;
    }

    public double hitungTelurrotitawar() {
        double hitung = this.telur / this.kemasanTelur * this.beratTelurrotitawar;
        return hitung;
    }

    public double hitungEsrotitawar() {
        double hitung = this.esBatu / this.kemasanEsBatu * this.beratEsBaturotitawar;
        return hitung;
    }
    
    public double hitungCoklatrotitawar() {
        double hitung = this.Coklat / this.kemasanCoklat * this.beratCoklatrotitawar;
        return hitung;
    }
    
    public double hitungKejurotitawar() {
        double hitung = this.keju / this.kemasanKeju * this.beratKejurotitawar;
        return hitung;
    }
    
    // end of     Mencari HPP Satu Adonan Roti Tawar
    
    //      Mencari Jumlah seluruh Bahan untuk keperluan pemesanan Roti Tawar
    public double hitungTerigu1rotitawar(){
        double hitung = this.beratTepungrotitawar / 5 * 20 + this.beratTepungrotitawar / 5 * 15  ;
        return hitung;
    }

    public double hitungGula1rotitawar() {
        double hitung = this.beratGulaPasirrotitawar / 5 * 20 + this.beratGulaPasirrotitawar / 5 * 15 ;
        return hitung;
    }

    public double hitungButter1rotitawar() {
        double hitung =  this.beratButterrotitawar / 5 * 20 +  this.beratButterrotitawar / 5 * 15  ;
        return hitung;
    }

    public double hitungRagi1rotitawar() {
        double hitung = this.beratRagirotitawar/ 5 * 20 + this.beratRagirotitawar/ 5 * 15;
        return hitung;
    }

    public double hitungSusuBubuk1rotitawar() {
        double hitung = this.beratSusuBubukrotitawar / 5 * 20 + this.beratSusuBubukrotitawar / 5 * 15;
        return hitung;
    }

    public double hitungSusuCair1rotitawar() {
        double hitung = this.beratSusuCairrotitawar / 5 * 20 + this.beratSusuCairrotitawar / 5 * 15;
        return hitung;
    }

    public double hitungTelur1rotitawar() {
        double hitung = this.beratTelurrotitawar / 5 * 20 + this.beratTelurrotitawar / 5 * 15;
        return hitung;
    }

    public double hitungEs1rotitawar() {
        double hitung = this.beratEsBaturotitawar / 5 * 20 + this.beratEsBaturotitawar / 5 * 15;
        return hitung;
    }
    
    public double hitungCoklat1rotitawar() {
        double hitung = this.beratCoklatrotitawar * 3;
        return hitung;
    }
    
    public double hitungKeju1rotitawar() {
        double hitung = this.beratKejurotitawar * 1;
        return hitung;
    }
    
    // End of Mencari Jumlah seluruh Bahan untuk keperluan pemesanan Roti Tawar
    
    // Mencari HPP roti tawar varian1
    @Override
    public double hitungModalrotitawar1() {
        totalhpprotitawar = this.hitungGularotitawar() + this.hitungButterrotitawar() + this.hitungEsrotitawar() + this.hitungRagirotitawar() + this.hitungSusuBubukrotitawar() + this.hitungSusuCairrotitawar() + this.hitungTelurrotitawar() + this.hitungCoklatrotitawar() + this.hitungKejurotitawar() + this.hitungTerigurotitawar();
        return totalhpprotitawar;
    }
    
    //      Mencari harga final dengan margin 50% Roti tawar varian 1
    public double hitungModalperpcsrotitawar1() {
        totalperpcsrotitawar = totalhpprotitawar /5 * 2;
        return totalperpcsrotitawar;
    }
    
   // Mencari HPP roti varian2
     public double hitungModalrotitawar2() {
        totalhpprotitawar = this.hitungGularotitawar() + this.hitungButterrotitawar() + this.hitungEsrotitawar() + this.hitungRagirotitawar() + this.hitungSusuBubukrotitawar() + this.hitungSusuCairrotitawar() + this.hitungTelurrotitawar() + this.hitungCoklatrotitawar() + this.hitungKejurotitawar() + this.hitungTerigurotitawar();
        return totalhpprotitawar;
    }
    //      Mencari harga final dengan margin 50% Roti tawar varian 2
    public double hitungModalperpcsrotitawar2() {
        totalperpcsrotitawar = totalhpprotitawar /5 * 2;
        return totalperpcsrotitawar;
    }
 
    public double hitungPesananrotitawar1() {
        totalpesananrotitawar = this.hitungModalperpcsrotitawar1() * 20;
        return totalpesananrotitawar;
    }
    
    public double hitungPesananrotitawar2() {
        totalpesananrotitawar = this.hitungModalperpcsrotitawar2() * 15;
        return totalpesananrotitawar;
    }
 
    // End of Mencari HPP roti tawar
}
