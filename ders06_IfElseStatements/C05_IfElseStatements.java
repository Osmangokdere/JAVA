package ders06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen yasinizi giriniz");

        double yas= scan.nextDouble();

        if (yas>=65) {
            System.out.println("Yasiniz emeklilik icin yeter35.5li");
        }else {
            System.out.println("emekli olmak için " +(65-yas)+ " daha calısmalısınız");


        }
        
    }
}
