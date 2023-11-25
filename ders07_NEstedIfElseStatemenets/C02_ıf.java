package ders07_NEstedIfElseStatemenets;

public class C02_ıf {
    public static void main(String[] args) {

        int urunAdedi=10;
        boolean kartVarMı=false;
        double listeFiyatı=12.5;
        double toplamFiyat=-5;


        if (kartVarMı && urunAdedi>10)
        {toplamFiyat=urunAdedi*listeFiyatı*(0.8);
            System.out.println("%20 indirimli fiyat: "+ toplamFiyat);}

        else if (!kartVarMı && urunAdedi<10 && urunAdedi>0) {toplamFiyat=urunAdedi*listeFiyatı*(0.85);
            System.out.println("%15 indirimli fiyat :"+ toplamFiyat);}
        else if (!kartVarMı && urunAdedi>=10)
        {toplamFiyat = urunAdedi * listeFiyatı * (0.85);
            System.out.println("%15 indirimli fiyat: " + toplamFiyat);}
        else if (!kartVarMı && urunAdedi<10 && urunAdedi>0)
        {toplamFiyat=urunAdedi*listeFiyatı*(0.9);
        System.out.println("%10 indirimli fiyat: "+toplamFiyat);}
    else{
            System.out.println("geçersiz giris");}
    }}




