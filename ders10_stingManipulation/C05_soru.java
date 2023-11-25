package ders10_stingManipulation;

public class C05_soru {
    public static void main(String[] args) {

        /*mail kontrolu yapan bir program hazırlayın
        1-mail @ isareti icermiyorsa "gecersiz email "
        2@gmail.com icermiyorsa "gmail adresi yazınız"
        3- @gmail.com ile bitmiyorsa "yazım hatası"
         */

        String email="ahmetqbulutluoz@gmail.com";

        if (!email.contains("@")){
            System.out.println("gecersiz e mail");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");

        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("yazım hatasi");
            
        }else{
            System.out.println("e mail basari ile kaydedildi");


    }}}
