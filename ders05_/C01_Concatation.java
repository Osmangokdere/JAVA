package ders05_;

public class C01_Concatation {
    public static void main(String[] args) {

        int x=133;
        System.out.println(x%3);

        String s1= "java";
        String s2= "Guzeldir";
        String s3=""; //hiçlik
        String s4=" ";// space

        int sayi1=4;
        int sayi2=3;

        //java7 güzeldir43

        System.out.println(s1+s3+(sayi2+sayi1+s4+s2+sayi1+sayi2));

        System.out.println(s1+s4+s2+(sayi1+sayi2)); //java güzeldir7

        System.out.println(s1+s4+s2+s4+(sayi1*sayi2));

        

        //7Java Guzeldir

        System.out.println(sayi2+sayi1+s1+s4+s2); //7java Güzeldir

        System.out.println(s3+sayi2+sayi1+s4+s1); //34 Java






    }
}
