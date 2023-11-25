package ders08_Ternary_Swich;

import java.util.Scanner;

public class C07_swich {
    public static void main(String[] args) {
        //J: java
        // D: DEvaloper,
        //k Kit

        //kullanicidan bir harf alin. j d k ise yukarıdakilerden birini yaazin,

        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf girin");

        char harf=scan.next().charAt(0);

        switch (harf){
            case 'J':
            case'j':
                System.out.println("Java");
                break;
            case'D':
            case'd':
                System.out.println("Developer");
                break;
            case'k':
            case 'K':
                System.out.println("kit");
            default:
                System.out.println("gecersiz");
        }



    }
}
