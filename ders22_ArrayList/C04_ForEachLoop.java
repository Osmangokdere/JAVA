package ders22_ArrayList;

public class C04_ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 4, 2, 6, 9, 6, 4, 5};

        //bu arraydeki 5 den buyuk olan tum elementleri toplayalım
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 5) {
                toplam += arr[i];
            }

        }System.out.println("for loop ile :" +toplam);
        toplam=0;
        // for each loop ile yapalım
        //3 seyi soylememiz lazım
        //1-hangi data turunden degiskenlerle ugrasacaksınız
        //2- loop un iceresinde herbir eleman geldiğinde hangi isimle islem yapacaksınız
        //3- hangi array veya colllection dan elewman gelecek


        for (int each:arr              //arr ye git her bir integer i bana getir
             ) {
            if (each>5){toplam+=each;

        }

    }System.out.println("for each loop ile toplam :"+toplam);


}}

