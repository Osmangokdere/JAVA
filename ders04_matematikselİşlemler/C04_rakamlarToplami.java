package ders04_matematikselİşlemler;

public class C04_rakamlarToplami {
    public static void main(String[] args) {

                    //kullanicinin girdiği 4 basamakli bir sayinin
                    //rakamlar toplamini yazan bir kod yaziniz
        int input=1455;

        int birlerBasamagi=0;
        int rakamlarToplami=0;
//birler basamagini al
        birlerBasamagi = input % 10; // bize 3 ü verir
// birler basamagini rakanlar toplamina ekle
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
//     birler basamaginden kurtul
         input=input/10;

        birlerBasamagi = input % 10; // bize 3 ü verir
        rakamlarToplami=birlerBasamagi;
        input=input/10;

        birlerBasamagi = input % 10; // bize 3 ü verir
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        input=input/10;

        birlerBasamagi = input % 10; // bize 3 ü verir
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        input=input/10;

        System.out.println("verilen sayinin rakamlar toplami :"+ rakamlarToplami);



    }
}
