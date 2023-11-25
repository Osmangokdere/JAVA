package ders08_Ternary_Swich;

public class C03_Ternary {
    public static void main(String[] args) {

        int a=5;
        /* Ternary operatörü tek basina kullanilamaz
        ternary bize sonuc uretir,
        bu sonucu ya direk bir yardirmali veya bir veliable a atamakiyiz
         */
        String sonuc=a%2==0 ? "cift sayı" :"teksayi";

        /* ternarn in sonucunu bir veriable ye atayacaksak
        true  ve false durumlarina uretilecek sonucun ayni data turune uygun olmasi gerekir
        aksi halde CTE olusur

        ama turnary i sout icinde kullanırsak aynı data turunun ayni olması sartı olmaz
         */

        String sonuc2= a>10 ? "buyuk sayı" : ""+2*a; //cte vermemesi icin Stirng ve cevirdik
        System.out.println(a>10 ? "buyuk sayi" : 2*a);


    }
}
