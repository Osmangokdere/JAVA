package ders29_StringBuilder_accessModifer;

public class C04_accessModifier {

        String isim="Ali";
        /*
        access modifier gozukmuyor, o zaman default access modifier gecerlidir
        bu class dan ve diger 29 package icerisidenki diger classlardan kullanılabilir
         */
        //default int sayi=10; default access modifier yazilamaz, YAZILAMAZ
        //yazmaya kalkarsanız java CTE verir

    private static int sayi1=10;

        public static void main(String[] args) {
            System.out.println(sayi1); //10


        }

    }

