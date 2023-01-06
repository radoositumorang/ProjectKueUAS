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
public class FinalHppPizza extends Modal{
    //Komposisi dough setiap pcs (gram)
    public double totalhpp2;
    public double totalperpcs2;
    public double totalpesanan2;
    public int beratTepung = 1000;
    public int beratGulaPasir = 100;
    public int beratButter = 100;
    public int beratRagi = 20;
    public int beratSusuBubuk = 200;
    public int beratSusuCair = 180;
    public int beratTelur = 50;
    public int beratEsBatu = 300;
    public int beratKeju = 30;
    public int beratSosis = 50;
    public int beratSmokeBeef = 50;
    public int beratBawangBombay = 30;
    
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
    public int kemasanSosis = 1000;
    public int kemasanSmokeBeef = 1000;
    public int kemasanBawangBombay = 500;
    
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
    public int sosis = 80000;
    public int smokeBeef = 90000;
    public int bawangBombay = 40000;
    
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
        double hitung = this.sosis / this.kemasanSosis * this.beratSosis;
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
        double hitung = this.beratTepung * 1;
        return hitung;
    }

    public double hitungGulaX() {
        double hitung = this.beratGulaPasir * 1;
        return hitung;
    }

    public double hitungButterX() {
        double hitung =  this.beratButter * 1;
        return hitung;
    }

    public double hitungRagiX() {
        double hitung = this.beratRagi * 1;
        return hitung;
    }

    public double hitungSusuBubukX() {
        double hitung = this.beratSusuBubuk * 1;
        return hitung;
    }

    public double hitungSusuCairX() {
        double hitung = this.beratSusuCair * 1;
        return hitung;
    }

    public double hitungTelurX() {
        double hitung = this.beratTelur * 1;
        return hitung;
    }

    public double hitungEsX() {
        double hitung = this.beratEsBatu * 1;
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
    @Override
    public double hitungModalPizza() {
        totalhpp2 = this.hitungTerigu3() + this.hitungGula3() + this.hitungButter3() + this.hitungRagi3() + this.hitungSusuBubuk3() + this.hitungSusuCair3() + this.hitungTelur3() + this.hitungEs3() + this.hitungKeju3() + this.hitungSosis3() + this.hitungSmokeBeef3() + this.hitungBawangBombay3();
        return totalhpp2;
    }
    
    // Mencari harga final dengan margin 50% Pizza
    @Override
    public double hitungModalperpcsPizza() {
        totalperpcs2 = totalhpp2 /10 * 2;
        return totalperpcs2;
    }
    
    @Override
    public double hitungPesananPizza() {
        totalpesanan2 = this.hitungModalperpcsPizza() * 10;
        return totalpesanan2;
    }
}
