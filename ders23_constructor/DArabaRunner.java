package ders23_constructor;

public class DArabaRunner {
    public static void main(String[] args) {
        //DAraba Class indan bir obje olusturalım

        DAraba arb1=new DAraba();
        System.out.println(arb1.marka);//marka belirtilmedi
        System.out.println(arb1.model); //model belirtilmedi
        System.out.println(arb1.yakit); //null
        System.out.println(arb1.yil);
        System.out.println(arb1.fiyat);

        arb1.marka="Tofas";
        arb1.model="Kartal";
        arb1.yakit="Benzin";
        arb1.yil=1991;
        arb1.fiyat=50000;
        arb1.maxHiz(arb1.yakit);

        System.out.println(arb1.marka);//Tofas
        System.out.println(arb1.model); //Kartaş
        System.out.println(arb1.yakit); //Benzin
        System.out.println(arb1.yil); //1991
        System.out.println(arb1.fiyat);//5000
        System.out.println(arb1.maxHiz(arb1.yakit));

        DAraba arb2=new DAraba();
        // birer kopya variable olusturur, her yeni araba uretildiginde standart
        // ozellikleri kullanır. sonradan kullanıcıdan alarak degistirme yapilir.

        //arb2 nin ozelliklerini yazdirmak istesem

        System.out.println("Marka : "+arb2.marka+
                            "\nModel : " + arb2.model+
                            "\nYakit : "+ arb2.yakit);

        DAraba arb3=new DAraba();

        System.out.println(arb3);
        System.out.println(arb1);//marka='Tofas', model='Kartal', yakit='Benzin', yil=1991, fiyat=50000}

        DAraba arb4=new DAraba();
        System.out.println(arb4);
    }
}
