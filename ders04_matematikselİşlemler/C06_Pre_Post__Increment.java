package ders04_matematikselİşlemler;

public class C06_Pre_Post__Increment {
    public static void main(String[] args) {

        int a=10;

        //a variablenin değerini yazdırıp sonra a nin degerini 1 artırın..

        //b veriablenin degerini 1 artırıp sonra yazdırın


        System.out.println(a); //10

        a++;

        int b=10;

       // ++b=11
        System.out.println(b); //

        int c=10;
// c++ post ıncrement işlemi denir. önce islemi yapar sonra artırımım yaopar

        System.out.println("c :"+ c++);

        int d=10;
//++d preIncrement islemi denir. once artırma yapıp sonra islemi yapar

        //islemin olduğu satırın bir alt satirina geçildiginde c ve d bir artmistir.
        System.out.println("d :"+ ++d);






    }
}
