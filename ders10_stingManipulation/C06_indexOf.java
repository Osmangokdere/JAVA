package ders10_stingManipulation;

public class C06_indexOf {
    public static void main(String[] args) {
        String str= "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); //9 ilk kucuk anın index ini bulur

        System.out.println(str.indexOf('c')); // karakter olarak c nin index

        System.out.println(str.indexOf("hersey")); // 15

        System.out.println(str.indexOf("e",9)); //13 "9 index ten sonra aramaya basla....

        //13. indexteki E den sonraki e nin indexini yazdirin


        int ilkcindex=str.indexOf("c");

        System.out.println(str.indexOf("c",ilkcindex+1));

    }
}
