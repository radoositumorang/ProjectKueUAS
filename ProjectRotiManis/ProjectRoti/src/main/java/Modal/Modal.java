/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modal;

/**
 *
 * @author asus
 */
public abstract class Modal {
    public abstract double hitungModalrotimanis();
    public abstract double hitungModalperpcs(); 
    public abstract double hitungModalrotimanis2();
    public abstract double hitungModalperpcs2();
    public abstract double hitungModalrotimanis3();
    public abstract double hitungModalperpcs3();
    public abstract double hitungTerigu1();
    public abstract double hitungGula1();
    public abstract double hitungButter1();
    public abstract double hitungRagi1();
    public abstract double hitungSusuBubuk1();
    public abstract double hitungSusuCair1();
    public abstract double hitungTelur1();
    public abstract double hitungEs1();
    public abstract double hitungCoklat1();
    public abstract double hitungKeju1();
    public abstract double hitungSosis1();
    public abstract double hitungRedbean1();
    public abstract double hitungPesanan1();
    public abstract double hitungPesanan2();
    public abstract double hitungPesanan3();
    
    public void tampilmodal(){
        
        System.out.println("Kebutuhan Tepung Total = " + this.hitungTerigu1());
        System.out.println("Kebutuhan Gula Total = " + this.hitungGula1());
        System.out.println("Kebutuhan Butter Total = " + this.hitungButter1());
        System.out.println("Kebutuhan Ragi = " + this.hitungRagi1());
        System.out.println("Kebutuhan SusuBubuk = " + this.hitungSusuBubuk1());
        System.out.println("Kebutuhan SusuCair = " + this.hitungSusuCair1());
        System.out.println("Kebutuhan telur = " + this.hitungTelur1());
        System.out.println("Kebutuhan Es = " + this.hitungEs1());
        System.out.println("Kebutuhan Coklat = " + this.hitungCoklat1());
        System.out.println("Kebutuhan Keju = " + this.hitungKeju1());
        System.out.println("Kebutuhan Redbean = " + this.hitungRedbean1());
        System.out.println("Kebutuhan Sosis = " + this.hitungSosis1());
        
        System.out.println("------------------------------------------");
        
        System.out.println("Jumlah harga modal setiap bahan roti varian 1  : " + this.hitungModalrotimanis());
        System.out.println("Harga roti varian 1 perpcs : " + this.hitungModalperpcs());
        
        System.out.println("------------------------------------------");
        
        System.out.println("Jumlah harga modal setiap bahan roti varian 2 : " + this.hitungModalrotimanis2());
        System.out.println("Harga roti varian 2 perpcs : " + this.hitungModalperpcs2());
        
        System.out.println("------------------------------------------");
        
        
        System.out.println("Jumlah harga modal setiap bahan roti varian 3 : " + this.hitungModalrotimanis3());
        System.out.println("Harga roti varian 3 perpcs : " + this.hitungModalperpcs3());
        
        System.out.println("------------------------------------------");
        
        System.out.println("Jumlah harga Jika pesanan varian 1 50 : " + this.hitungPesanan1());
        System.out.println("Jumlah harga Jika pesanan varian 2 100 : " + this.hitungPesanan2());
        System.out.println("Jumlah harga Jika pesanan varian 3 70 : " + this.hitungPesanan3());
        
        
    }
}
