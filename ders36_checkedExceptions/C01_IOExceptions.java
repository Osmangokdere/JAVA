package ders36_checkedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {


        FileInputStream fis=new FileInputStream("ders36_checkedExceptions/deneme.txt");
        FileOutputStream fos=new FileOutputStream("ders36_checkedExceptions/deneme.txt");

        //java ile bilgisayarimizdaki bir dosyaya ulasmak istersek
        //FileInputStream classs indan obje olusturup
        // o obje araciligiyla dosya kullanilabilir

        //fis olıustururken ulasmak istedigimiz dosyanin
        //dosya yolunu parametre olarak girmeliyiz

        /*
        checked exception olusturma ihtimali olan
         */


    }
}
