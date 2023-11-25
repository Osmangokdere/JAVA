package ders24_constructors;

public class Araba {
    String marka="marka belirtilmedi";
    String model="model belirtilmedi";
    String yakit;
    int yil;

    public Araba(String marka, String model, String yakit, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    int fiyat;

    public Araba(String marka, String model, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    public Araba(String mrk, String mdl){
        marka=mrk;
        model=mdl;

    }

    public Araba(){

    }
    @Override
    public String toString() {
        return "Araba Ozellikleri" +
                "\nmarka : " + marka +
                "\nModel : " + model +
                "\nyakit : " + yakit +
                "\nyil  : " + yil +
                "\nfiyat : " + fiyat;
    }
}
