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
public abstract class Modal {
    //Roti Tawar
    public abstract double hitungModalrotitawar1();
    public abstract double hitungModalperpcsrotitawar1();
    public abstract double hitungModalrotitawar2();
    public abstract double hitungModalperpcsrotitawar2();
    public abstract double hitungTerigu1rotitawar();
    public abstract double hitungGula1rotitawar();
    public abstract double hitungButter1rotitawar();
    public abstract double hitungRagi1rotitawar();
    public abstract double hitungSusuBubuk1rotitawar();
    public abstract double hitungSusuCair1rotitawar();
    public abstract double hitungTelur1rotitawar();
    public abstract double hitungEs1rotitawar();
    public abstract double hitungCoklat1rotitawar();
    public abstract double hitungKeju1rotitawar();
    public abstract double hitungPesananrotitawar1();
    public abstract double hitungPesananrotitawar2();
    
    public void tampilmodal(){
        //Roti Tawar
        System.out.println("ROTI Tawar");
        System.out.println("------------------------------------------");
        System.out.println("Kebutuhan Tepung Total = " + Math.round(this.hitungTerigu1rotitawar()) + "g");
        System.out.println("Kebutuhan Gula Total = " + Math.round(this.hitungGula1rotitawar()) + "g");
        System.out.println("Kebutuhan Butter Total = " + Math.round(this.hitungButter1rotitawar())+ "g");
        System.out.println("Kebutuhan Ragi = " + Math.round(this.hitungRagi1rotitawar())+ "g");
        System.out.println("Kebutuhan SusuBubuk = " + Math.round(this.hitungSusuBubuk1rotitawar())+ "g");
        System.out.println("Kebutuhan SusuCair = " + Math.round(this.hitungSusuCair1rotitawar())+ "g");
        System.out.println("Kebutuhan telur = " + Math.round(this.hitungTelur1rotitawar())+ "g");
        System.out.println("Kebutuhan Es = " + Math.round(this.hitungEs1rotitawar())+ "g");
        System.out.println("Kebutuhan Coklat = " + Math.round(this.hitungCoklat1rotitawar())+ "g");
        System.out.println("Kebutuhan Keju = " + Math.round(this.hitungKeju1rotitawar())+ "g");
        
        System.out.println("------------------------------------------");
        
        System.out.println("Jumlah harga modal setiap bahan roti tawar varian 1  : " + Math.round(this.hitungModalrotitawar1()));
        System.out.println("Harga roti tawar varian 1 perpcs : " + Math.round(this.hitungModalperpcsrotitawar1()));
        
        System.out.println("------------------------------------------");
        
        System.out.println("Jumlah harga modal setiap bahan roti tawar varian 2 : " + Math.round(this.hitungModalrotitawar2()));
        System.out.println("Harga roti tawar varian 2 perpcs : " + Math.round(this.hitungModalperpcsrotitawar1()));
        
        System.out.println("------------------------------------------");
        
        System.out.println("Jumlah harga Jika pesanan varian 1 20 : " + Math.round(this.hitungPesananrotitawar1()));
        System.out.println("Jumlah harga Jika pesanan varian 2 15 : " + Math.round(this.hitungPesananrotitawar2()));
        System.out.println("------------------------------------------");
}

}