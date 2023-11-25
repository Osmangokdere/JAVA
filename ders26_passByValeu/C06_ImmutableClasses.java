package ders26_passByValeu;

import java.util.ArrayList;
import java.util.List;

public class C06_ImmutableClasses {
    public static void main(String[] args) {
        String str="Java guzeldir";
        System.out.println(str.toUpperCase()); //JAVA GUZELDİR

        System.out.println(str);// java guzeldir

        str.toLowerCase();

                System.out.println(str);// java guzeldir

        //String immutable oldugu icin method ile yapılan degisiklikler
        //Stringi kalici olarka degistrimez

        List<String> harfler=new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.remove(0);

        System.out.println(harfler); //[B]

        //List ve Array mutable(degistirilebilir) olduklari icin method ile yapilan dedgisiklikler
        //kalici olur

    }
}
