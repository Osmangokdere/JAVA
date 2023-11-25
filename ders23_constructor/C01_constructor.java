package ders23_constructor;

import java.util.Scanner;

public class C01_constructor {
    public static void main(String[] args) {

        //Scannner class ındaki method ve variableleri(ozellikleri) kullanmak icin scan objesi olustururuz

        Scanner scan=new Scanner(System.in);
        //System.out.println("lutfen bir tusa basınız");
        scan.nextInt();


        String str=new String("java Candir");
        String str2="Java ne guzel";
        System.out.println(str2.toLowerCase());
    }

}
