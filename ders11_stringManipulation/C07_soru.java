package ders11_stringManipulation;

public interface C07_soru {
    public static void main(String[] args) {

        String isim="MEHMet";
        String soyisim="HARuNGIL";
        String yeniIsimSoyisim;

        if (isim.length()>soyisim.length()){
            // isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin

            yeniIsimSoyisim= isim.substring(0,1).toUpperCase()+
                    isim.substring(1).toLowerCase()+
                    " "+
                    soyisim.substring(0,1).toUpperCase()+
                    soyisim.substring(1).toLowerCase();

        }else {
            // ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

            yeniIsimSoyisim=isim.substring(0,1).toUpperCase()+
                    isim.substring(1).toLowerCase()+
                    " "+
                    soyisim.toUpperCase();

        }
        System.out.println(yeniIsimSoyisim);
        }

    }



