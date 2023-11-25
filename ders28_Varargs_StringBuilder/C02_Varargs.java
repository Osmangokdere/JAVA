package ders28_Varargs_StringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        topla(5,6);
        topla(5,3,8);
        topla(2,4,6,8);
        topla();
        topla(568,265);

        /*
        bir method da parametre sayisini sinirlandirmak istemezsek
        standart method yerine varargs kullaniriz

        Varargs data turunun yanina ... konularak deklare edilir.
        Anlami;
        int... ==> sayisi belirli olmayan int parametreledr alan bir arraydir.
         */

    }
        private static void topla(int... sayilar) {

        int toplamsonucu=0;

            for (int each:sayilar
                 ) {
                toplamsonucu+=each;

            }
            System.out.println("girilen sayilarin toplami :" +toplamsonucu);


    }
}
