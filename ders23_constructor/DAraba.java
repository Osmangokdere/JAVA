package ders23_constructor;

public class DAraba {
    //bir proje olsurulurken tum classlarda  main metod olmasına  gerek yoktur
    //cogu class obje olusturularak kullanılmak uzere hazırlanmıs depolardır
    //Biz de bu class i araba objeleri icin bir depo olarak dizayn edelim
    // her class olusturuldugunda java o class dan obje olusturulabilmesi icin
    //default bir constructor olusturur
    //ama bu default constractor gorunmez
    //default constructor parametresizdir ve bize standart biz obje olusturur

    String marka="marka belirtilmedi";
    String model="model belirtilmedi";
    String yakit;
    int yil;
    int fiyat;

    @Override
    public String toString() {
        return "Araba Ozellikleri" +
                "\nmarka : " + marka +
                "\nModel : " + model +
                "\nyakit : " + yakit +
                "\nyil  : " + yil +
                "\nfiyat : " + fiyat;
    }

    public int maxHiz (String yakit){
        int maxHiz=120;
        if (yakit.equalsIgnoreCase("Dizel")){
            maxHiz=200;
        }else if (yakit.equalsIgnoreCase("Benzin")){
            maxHiz=230;
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            maxHiz=180;
        } return maxHiz;

            
        }

    }








