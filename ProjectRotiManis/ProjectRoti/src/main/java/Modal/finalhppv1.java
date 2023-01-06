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
    
    // end of     Mencari HPP Satu adonan
    
    //      Mencari Jumlah seluruh Bahan untuk keperluan pemesanan
    public double hitungTerigu1(){
        double hitung = this.beratTepung * 3;
        return hitung;
    }

    public double hitungGula1() {
        double hitung = this.beratGulaPasir * 3;
        return hitung;
    }

    public double hitungButter1() {
        double hitung =  this.beratButter *3;
        return hitung;
    }

    public double hitungRagi1() {
        double hitung = this.beratRagi*3 ;
        return hitung;
    }

    public double hitungSusuBubuk1() {
        double hitung = this.beratSusuBubuk * 3;
        return hitung;
    }

    public double hitungSusuCair1() {
        double hitung = this.beratSusuCair * 3;
        return hitung;
    }

    public double hitungTelur1() {
        double hitung = this.beratTelur * 3;
        return hitung;
    }

    public double hitungEs1() {
        double hitung = this.beratEsBatu * 3;
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
        totalpesanan = this.hitungModalperpcs2() * 700;
        return totalpesanan;
    }
    
}
