/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modal;

/**
 *
 * @author asus
 */
public class finalhppv1 extends Modal  {
    public double totalhpp;
    public double totalperpcs;
    public double totalpesanan;
    public double totalhpp2;
    public double totalperpcs2;
    public double totalpesanan2;
    public int beratTepung = 1000;
    public int beratGulaPasir = 150;
    public int beratButter = 150;
    public int beratRagi = 20;
    public int beratSusuBubuk = 300;
    public int beratSusuCair = 250;
    public int beratTelur = 80;
    public int beratEsBatu = 400;
    public int beratKeju = 5;
    public int beratCoklat = 10;
    public int beratRedbean = 10;
    public int beratKrimvanilla = 5;
    public int beratSosis = 10;
    public int beratSmokeBeef = 50;
    public int beratBawangBombay = 30;
    
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
    public int kemasanRedbean = 500;
    public int kemasanKrimvanilla = 500;
    public int kemasanSosis = 1000;
    public int kemasanSmokeBeef = 1000;
    public int kemasanBawangBombay = 500;
    
    public int tepungTerigu = 40000;
    public int gulaPasir = 25000;
    public int butter = 23000;
    public int ragi = 5000;
    public int susuBubuk = 39000;
    public int susuCair = 24000;
    public int telur = 23000;
    public int esBatu = 2000;
    public int keju = 31000;
    public int coklat = 29000;
    public int Redbean = 25000;
    public int krimVanilla = 30000;
    public int Sosis = 80000;
    public int smokeBeef = 90000;
    public int bawangBombay = 40000;
    
    public double hitungTerigu(){
        double hitung = this.tepungTerigu / this.kemasanTepung * this.beratTepung;
        return hitung;
    }
    
    //      Mencari HPP Satu adonan
    public double hitungGula() {
        double hitung = this.gulaPasir / this.kemasanGulaPasir * this.beratGulaPasir;
        return hitung;
    }

    public double hitungButter() {
        double hitung = this.butter / this.kemasanButter * this.beratButter;
        return hitung;
    }

    public double hitungRagi() {
        double hitung = this.ragi / this.kemasanRagi * this.beratRagi;
        return hitung;
    }

    public double hitungSusuBubuk() {
        double hitung = this.susuBubuk / this.kemasanSusuBubuk * this.beratSusuBubuk;
        return hitung;
    }

    public double hitungSusuCair() {
        double hitung = this.susuCair / this.kemasanSusuCair * this.beratSusuCair;
        return hitung;
    }

    public double hitungTelur() {
        double hitung = this.telur / this.kemasanTelur * this.beratTelur;
        return hitung;
    }

    public double hitungEs() {
        double hitung = this.esBatu / this.kemasanEsBatu * this.beratEsBatu;
        return hitung;
    }
    
    public double hitungCoklat() {
        double hitung = this.coklat / this.kemasanCoklat * this.beratCoklat;
        return hitung;
    }
    
    public double hitungKeju() {
        double hitung = this.keju / this.kemasanKeju * this.beratKeju;
        return hitung;
    }
    
    public double hitungRedbean() {
        double hitung = this.Redbean / this.kemasanRedbean * this.beratRedbean;
        return hitung;
    }
    
    public double hitungKrimvanilla() {
        double hitung = this.krimVanilla / this.kemasanKrimvanilla * this.beratKrimvanilla;
        return hitung;
    }
    
    public double hitungSosis() {
        double hitung = this.Sosis / this.kemasanSosis * this.beratSosis;
        return hitung;
    }
   
    //      Mencari Jumlah seluruh Bahan untuk keperluan pemesanan
    public double hitungTerigu1(){
        double hitung = this.beratTepung / 47 * 50 + this.beratTepung / 47 * 100 + this.beratTepung / 47 * 70;
        return hitung;
    }

    public double hitungGula1() {
        double hitung = this.beratGulaPasir / 47 * 50 + this.beratGulaPasir / 47 * 100 + this.beratGulaPasir / 47 * 70;
        return hitung;
    }

    public double hitungButter1() {
        double hitung =  this.beratButter / 47 * 50 + this.beratButter / 47 * 100 + this.beratButter / 47 * 70 ;
        return hitung;
    }

    public double hitungRagi1() {
        double hitung ;
        hitung = 93.6170213;
        return hitung;
    }

    public double hitungSusuBubuk1() {
        double hitung = this.beratSusuBubuk / 47 * 50 + this.beratSusuBubuk / 47 * 100 + this.beratSusuBubuk / 47 * 70;
        return hitung;
    }

    public double hitungSusuCair1() {
        double hitung = this.beratSusuCair / 47 * 50 + this.beratSusuCair / 47 * 100 + this.beratSusuCair / 47 * 70;
        return hitung;
    }

    public double hitungTelur1() {
        double hitung = this.beratTelur / 47 * 50 + this.beratTelur / 47 * 100 + this.beratTelur / 47 * 70;
        return hitung;
    }

    public double hitungEs1() {
        double hitung = this.beratEsBatu / 47 * 50 + this.beratEsBatu / 47 * 100 + this.beratEsBatu / 47 * 70;
        return hitung;
    }
    
    public double hitungCoklat1() {
        double hitung = this.beratCoklat * 3;
        return hitung;
    }
    
    public double hitungKeju1() {
        double hitung = this.beratKeju * 1;
        return hitung;
    }
    
    public double hitungRedbean1() {
        double hitung =  this.beratRedbean * 1;
        return hitung;
    }
    
    public double hitungKrimvanilla1() {
        double hitung = this.beratKrimvanilla * 1;
        return hitung;
    }
    
    public double hitungSosis1() {
        double hitung = this.beratSosis * 1;
        return hitung;
    }
    
    
    
    // Mencari HPP roti varian1
    @Override
    public double hitungModalrotimanis() {
        totalhpp = this.hitungGula() + this.hitungButter() + this.hitungEs() + this.hitungRagi() + this.hitungSusuBubuk() + this.hitungSusuCair() + this.hitungTelur() + this.hitungCoklat() + this.hitungKeju() + this.hitungTerigu();
        return totalhpp;
    }
    
    //      Mencari harga final dengan margin 50% Roti manis varian 1
    public double hitungModalperpcs() {
        totalperpcs = totalhpp /47 * 2;
        return totalperpcs;
    }
    
   // Mencari HPP roti varian2
     public double hitungModalrotimanis2() {
        totalhpp = this.hitungGula() + this.hitungButter() + this.hitungEs() + this.hitungRagi() + this.hitungSusuBubuk() + this.hitungSusuCair() + this.hitungTelur() + this.hitungRedbean()+ this.hitungKrimvanilla()+ this.hitungTerigu();
        return totalhpp;
    }
    //      Mencari harga final dengan margin 50% Roti manis varian 2
    public double hitungModalperpcs2() {
        totalperpcs = totalhpp /47 * 2;
        return totalperpcs;
    }
    
    // Mencari HPP roti varian3
    public double hitungModalrotimanis3() {
        totalhpp = this.hitungGula() + this.hitungButter() + this.hitungEs() + this.hitungRagi() + this.hitungSusuBubuk() + this.hitungSusuCair() + this.hitungTelur() + this.hitungSosis()+ this.hitungKeju() + this.hitungTerigu();
        return totalhpp;
    }
    
    //      Mencari harga final dengan margin 50% Roti manis varian 3
    public double hitungModalperpcs3() {
        totalperpcs = totalhpp /47 * 2;
        return totalperpcs;
    }
    
    public double hitungPesanan1() {
        totalpesanan = this.hitungModalperpcs() * 50;
        return totalpesanan;
    }
    
    public double hitungPesanan2() {
        totalpesanan = this.hitungModalperpcs2() * 100;
        return totalpesanan;
    }
    
    public double hitungPesanan3() {
        totalpesanan = this.hitungModalperpcs2() * 70;
        return totalpesanan;
    }
    
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
        double hitung = this.coklat / this.kemasanCoklat * this.beratCoklatrotitawar;
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
    
    // Pizza
    // Mencari HPP Satu Adonan
    public double hitungTerigu3(){
        double hitung = this.tepungTerigu / this.kemasanTepung * this.beratTepung;
        return hitung;
    }
    
    public double hitungGula3() {
        double hitung = this.gulaPasir / this.kemasanGulaPasir * this.beratGulaPasir;
        return hitung;
    }

    public double hitungButter3() {
        double hitung = this.butter / this.kemasanButter * this.beratButter;
        return hitung;
    }

    public double hitungRagi3() {
        double hitung = this.ragi / this.kemasanRagi * this.beratRagi;
        return hitung;
    }

    public double hitungSusuBubuk3() {
        double hitung = this.susuBubuk / this.kemasanSusuBubuk * this.beratSusuBubuk;
        return hitung;
    }

    public double hitungSusuCair3() {
        double hitung = this.susuCair / this.kemasanSusuCair * this.beratSusuCair;
        return hitung;
    }

    public double hitungTelur3() {
        double hitung = this.telur / this.kemasanTelur * this.beratTelur;
        return hitung;
    }

    public double hitungEs3() {
        double hitung = this.esBatu / this.kemasanEsBatu * this.beratEsBatu;
        return hitung;
    }
    
    public double hitungKeju3() {
        double hitung = this.keju / this.kemasanKeju * this.beratKeju;
        return hitung;
    }

    public double hitungSosis3() {
        double hitung = this.Sosis / this.kemasanSosis * this.beratSosis;
        return hitung;
    }
      
    public double hitungSmokeBeef3() {
        double hitung = this.smokeBeef / this.kemasanSmokeBeef * this.beratSmokeBeef;
        return hitung;
    }
    
    public double hitungBawangBombay3() {
        double hitung = this.bawangBombay / this.kemasanBawangBombay * this.beratBawangBombay;
        return hitung;
    }   
    // end of Mencari HPP Satu Adonan
    
    // Mencari Jumlah seluruh Bahan untuk keperluan pemesanan
    public double hitungTeriguX(){
        double hitung = this.beratTepung / 10 * 10;
        return hitung;
    }

    public double hitungGulaX() {
        double hitung = this.beratGulaPasir / 10 * 10;
        return hitung;
    }

    public double hitungButterX() {
        double hitung =  this.beratButter / 10 * 10 ;
        return hitung;
    }

    public double hitungRagiX() {
        double hitung = this.beratRagi / 10 * 10;
        return hitung;
    }

    public double hitungSusuBubukX() {
        double hitung = this.beratSusuBubuk / 10 * 10;
        return hitung;
    }

    public double hitungSusuCairX() {
        double hitung = this.beratSusuCair / 10 * 10;
        return hitung;
    }

    public double hitungTelurX() {
        double hitung = this.beratTelur / 10 * 10;
        return hitung;
    }

    public double hitungEsX() {
        double hitung = this.beratEsBatu / 10 * 10;
        return hitung;
    }
    
    public double hitungKejuX() {
        double hitung = this.beratKeju * 1;
        return hitung;
    }
    
    public double hitungSosisX() {
        double hitung =  this.beratSosis * 1;
        return hitung;
    }
    
    public double hitungSmokeBeefX() {
        double hitung = this.beratSmokeBeef * 1;
        return hitung;
    }
    
    public double hitungBawangBombayX() {
        double hitung = this.beratBawangBombay * 1;
        return hitung;
    }
    
    // Mencari HPP Pizza
    public double hitungModalPizza() {
        totalhpp2 = this.hitungTerigu3() + this.hitungGula3() + this.hitungButter3() + this.hitungRagi3() + this.hitungSusuBubuk3() + this.hitungSusuCair3() + this.hitungTelur3() + this.hitungEs3() + this.hitungKeju3() + this.hitungSosis3() + this.hitungSmokeBeef3() + this.hitungBawangBombay3();
        return totalhpp2;
    }
    
    // Mencari harga final dengan margin 50% Pizza
    public double hitungModalperpcsPizza() {
        totalperpcs2 = totalhpp2 /10 * 2;
        return totalperpcs2;
    }
    
    public double hitungPesananPizza() {
        totalpesanan2 = this.hitungModalperpcsPizza() * 10;
        return totalpesanan2;
    }
}
