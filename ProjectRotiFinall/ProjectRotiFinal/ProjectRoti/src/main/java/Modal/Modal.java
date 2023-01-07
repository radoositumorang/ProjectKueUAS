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
    
    //Pizza
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
        
        //Roti Manis
        System.out.println("ROTI MANIS");
        System.out.println("------------------------------------------");
        System.out.println("Kebutuhan Tepung Total = " + Math.round(this.hitungTerigu1())+ "g");
        System.out.println("Kebutuhan Gula Total = " + Math.round(this.hitungGula1())+ "g");
        System.out.println("Kebutuhan Butter Total = " + Math.round(this.hitungButter1())+ "g");
        System.out.println("Kebutuhan Ragi = " + Math.round(this.hitungRagi1())+ "g");
        System.out.println("Kebutuhan SusuBubuk = " + Math.round(this.hitungSusuBubuk1())+ "g");
        System.out.println("Kebutuhan SusuCair = " + Math.round(this.hitungSusuCair1())+ "g");
        System.out.println("Kebutuhan telur = " + Math.round(this.hitungTelur1())+ "g");
        System.out.println("Kebutuhan Es = " + Math.round(this.hitungEs1())+ "g");
        System.out.println("Kebutuhan Coklat = " + Math.round(this.hitungCoklat1())+ "g");
        System.out.println("Kebutuhan Keju = " + Math.round(this.hitungKeju1())+ "g");
        System.out.println("Kebutuhan Redbean = " + Math.round(this.hitungRedbean1())+ "g");
        System.out.println("Kebutuhan Sosis = " + Math.round(this.hitungSosis1())+ "g");
        
        System.out.println("------------------------------------------");
        
        System.out.println("Jumlah harga modal setiap bahan roti varian 1  : " + Math.round(this.hitungModalrotimanis()));
        System.out.println("Harga roti varian 1 perpcs : " + Math.round(this.hitungModalperpcs()));
        
        System.out.println("------------------------------------------");
        
        System.out.println("Jumlah harga modal setiap bahan roti varian 2 : " + Math.round(this.hitungModalrotimanis2()));
        System.out.println("Harga roti varian 2 perpcs : " + Math.round(this.hitungModalperpcs2()));
        
        System.out.println("------------------------------------------");
        
        
        System.out.println("Jumlah harga modal setiap bahan roti varian 3 : " + Math.round(this.hitungModalrotimanis3()));
        System.out.println("Harga roti varian 3 perpcs : " + Math.round(this.hitungModalperpcs3()));
        
        System.out.println("------------------------------------------");
        
        System.out.println("Jumlah harga Jika pesanan varian 1 50 : " + Math.round(this.hitungPesanan1()));
        System.out.println("Jumlah harga Jika pesanan varian 2 100 : " + Math.round(this.hitungPesanan2()));
        System.out.println("Jumlah harga Jika pesanan varian 3 70 : " + Math.round(this.hitungPesanan3()));
        System.out.println("------------------------------------------");
        
        
        
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
        
        
        
        //Pizza
        System.out.println("PIZZA");
        System.out.println("------------------------------------------");
        System.out.println("Kebutuhan Tepung        : " + Math.round(this.hitungTeriguX()) + " g");
        System.out.println("Kebutuhan Gula          : " + Math.round(this.hitungGulaX())   + "  g");
        System.out.println("Kebutuhan Butter        : " + Math.round(this.hitungButterX()) + "  g");
        System.out.println("Kebutuhan Ragi          : " + Math.round(this.hitungRagiX()) + "  g");
        System.out.println("Kebutuhan SusuBubuk     : " + Math.round(this.hitungSusuBubukX()) + "  g");
        System.out.println("Kebutuhan SusuCair      : " + Math.round(this.hitungSusuCairX()) + "  g");
        System.out.println("Kebutuhan Telur         : " + Math.round(this.hitungTelurX()) + "  g");
        System.out.println("Kebutuhan Es            : " + Math.round(this.hitungEsX()) + "   g");
        System.out.println("Kebutuhan Keju          : " + Math.round(this.hitungKejuX()) + "  g");
        System.out.println("Kebutuhan Sosis         : " + Math.round(this.hitungSosisX()) + "  g");
        System.out.println("Kebutuhan Smoke Beef    : " + Math.round(this.hitungSmokeBeefX()) + "  g");
        System.out.println("Kebutuhan Bawang Bombay : " + Math.round(this.hitungBawangBombayX()) + "  g");
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Jumlah Harga Modal Setiap Bahan Pizza : " + Math.round(this.hitungModalPizza()));
        System.out.println("Harga Pizza                           : " + Math.round(this.hitungModalperpcsPizza()));
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Jumlah Harga Jika Pesanan 10 pcs      : " + Math.round(this.hitungPesananPizza()));
        
    }
}
