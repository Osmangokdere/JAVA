package ders14_MethodOlusturma;

public class C04_Tekrar {
    public static void main(String[] args) {



        int a=10;
        int b=20;
        System.out.println(C01_Carpım.carpımMethodu(a, b));

        String c="nasil";
        String d="yani";

        System.out.println(C02_stringConcate.birlestirMethodu(c, d));

        String e="Bu da mi oldu?";
        System.out.println(C03_String_TerseCevirme.stringiTerseCevir(e));


        //" bu buleyi terse cevir"

        System.out.println(C03_String_TerseCevirme.stringiTerseCevir("bu buleyi terse cevir"));
    }
}
