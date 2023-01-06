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
    public abstract double hitungModalPizza();
    public abstract double hitungModalperpcsPizza();
    public abstract double hitungTeriguX();
    public abstract double hitungGulaX();
    public abstract double hitungButterX();
    public abstract double hitungRagiX();
    public abstract double hitungSusuBubukX();
    public abstract double hitungSusuCairX();
    public abstract double hitungTelurX();
    public abstract double hitungEsX();
    public abstract double hitungKejuX();
    public abstract double hitungSosisX();
    public abstract double hitungBawangBombayX();
    public abstract double hitungSmokeBeefX();
    public abstract double hitungPesananPizza();
    
    public void tampilmodal(){
        System.out.println("Kebutuhan Tepung        : " + this.hitungTeriguX() + " g");
        System.out.println("Kebutuhan Gula          : " + this.hitungGulaX()   + "  g");
        System.out.println("Kebutuhan Butter        : " + this.hitungButterX() + "  g");
        System.out.println("Kebutuhan Ragi          : " + this.hitungRagiX() + "  g");
        System.out.println("Kebutuhan SusuBubuk     : " + this.hitungSusuBubukX() + "  g");
        System.out.println("Kebutuhan SusuCair      : " + this.hitungSusuCairX() + "  g");
        System.out.println("Kebutuhan Telur         : " + this.hitungTelurX() + "  g");
        System.out.println("Kebutuhan Es            : " + this.hitungEsX() + "   g");
        System.out.println("Kebutuhan Keju          : " + this.hitungKejuX() + "  g");
        System.out.println("Kebutuhan Sosis         : " + this.hitungSosisX() + "  g");
        System.out.println("Kebutuhan Smoke Beef    : " + this.hitungSmokeBeefX() + "  g");
        System.out.println("Kebutuhan Bawang Bombay : " + this.hitungBawangBombayX() + "  g");
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Jumlah Harga Modal Setiap Bahan Pizza : " + this.hitungModalPizza());
        System.out.println("Harga Pizza                           : " + this.hitungModalperpcsPizza());
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Jumlah Harga Jika Pesanan 10 pcs      : " + this.hitungPesananPizza());  
    }
}
