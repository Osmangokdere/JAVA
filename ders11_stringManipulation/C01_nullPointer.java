package ders11_stringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {

        String str1="";
        //str1 e deger atanmistir.
        System.out.println(str1); //hiclik yazdirir

        System.out.println(str1.concat("java"));

        String str2;
        //str2 olusturuldu ama deger atanmadi
        //System.out.println(str2); deger atanmadigi icin yazdırılamaz
        //System.out.println(str2.concat("java")); deger atanmadigi icin metodla kullanilamaz.

        str2="java candir";
        System.out.println(str2);

        System.out.println(str2.concat("."));

        String str3=null; //str3 e deger atanmadiginin farkındayım
        System.out.println(str3);

        //System.out.println(str3.concat("java")); //NullPointerException

        System.out.println(str3+"java"); //toplama yapar

        //System.out.println(str3.toUpperCase());//


    }
}
