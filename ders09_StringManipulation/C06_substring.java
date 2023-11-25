package ders09_StringManipulation;

public class C06_substring {
    public static void main(String[] args) {

        String str="Java ogren, isi kap";

        System.out.println(str.substring(5)); //ogren isi kap

        System.out.println(str.substring(0));

        System.out.println(str.length()); //19

        //son karakeri Sring olarka yaz

        String sonHarf=""+str.charAt(str.length()-1); //char verir ""+ yaparak string yaptık

        sonHarf=str.substring(str.length()-1);

        System.out.println(sonHarf);

        //son indexdeki karakteri uppper case olarka yazdırin

        System.out.println(str.substring(str.length()-1).toUpperCase()); //P

        // son uc harfi buyuk harf oolaerak yazdirin

        System.out.println(str.substring(str.length()-3).toUpperCase());







    }
}
