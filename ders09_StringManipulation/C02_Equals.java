package ders09_StringManipulation;

public class C02_Equals {
    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";
        String str3=new String("Ali");
        String str4= "Ali";


        System.out.println(str1==str2); //false
        System.out.println(str1==str3);
        System.out.println(str1==str4);

        /*
        == String'leri karsılastirmalarda kesin calisması icin, surpriz verir

        == yerine equals() kullanilmalidir. kesin sonuc veriri.
         */

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));


    }
}
