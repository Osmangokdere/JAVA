package ders13_forLoop;

public class C06_nestedForLoop {
    public static void main(String[] args) {


        for (int i =1 ; i <=5 ; i++) { //dıs satır kontrol ediyor
            for (int j = 1; j <=i ; j++) {
                System.out.print(i*j+ " ");

            }
            System.out.println("");

        }
    }
}
