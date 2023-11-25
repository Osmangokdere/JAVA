package ders06_IfElseStatements;

import java.util.Scanner;

public class C01_IfStataments {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen ay isminin ilk harfini girin");
        char ilkharf=scan.next().charAt(0);

        if (ilkharf=='o' || ilkharf=='O'){
            System.out.println("Ocak");
        }

    }
}
