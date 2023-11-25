package ders33_inheritanceDataTypeKullanimi_overriding;

public class Corolla extends BToyota{
    String model="Corolla";
    String uretimYeri="Turkiye";
    int yil=2023;

    public static void main(String[] args) {
        Corolla corolla1=new Corolla();

        System.out.println(corolla1.model); //Corolla
        System.out.println(corolla1.uretimYeri); //Turkiye
        System.out.println(corolla1.yil);//2023;
        System.out.println(corolla1.marka);//Binek araclarin markasi vardir"
        System.out.println(corolla1.motor);//
        System.out.println(corolla1.plaka);
        System.out.println(corolla1.yakit);



        BToyota corolla2=new Corolla();

        System.out.println(corolla2.model); //Corolla
        //System.out.println(corolla2.uretimYeri); //CTE verir
        System.out.println(corolla2.yil);//2023;
        System.out.println(corolla2.marka);//Binek araclarin markasi vardir"
        System.out.println(corolla2.motor);//
        System.out.println(corolla2.plaka);
        System.out.println(corolla2.yakit);


        Araba corolla3=new Corolla();

        //System.out.println(corolla3.model); //CTE
        //System.out.println(corolla3.uretimYeri); //CTE
        //System.out.println(corolla3.yil);//2CTE
        //System.out.println(corolla3.marka);//CTE
        System.out.println(corolla3.motor);//Araba
        System.out.println(corolla3.plaka);//Araba
        System.out.println(corolla3.yakit);//Araba

        BToyota toyota1=new BToyota();
        System.out.println(toyota1.model); //Corolla
        System.out.println(toyota1.yil);//2023;
        System.out.println(toyota1.marka);//Binek araclarin markasi vardir"
        System.out.println(toyota1.motor);//
        System.out.println(toyota1.plaka);
        System.out.println(toyota1.yakit);


        Araba toyota2=new BToyota();
        //System.out.println(toyota2.model); //CTE
        //System.out.println(toyota2.yil);//CTE
        //System.out.println(toyota2.marka);//CTE"
        System.out.println(toyota2.motor);//
        System.out.println(toyota2.plaka);
        System.out.println(toyota2.yakit);


    }
}
