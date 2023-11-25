package ders27_immitableClases_DateAndTime;

import java.util.ArrayList;
import java.util.List;

public class C03_StringPool {
    public static void main(String[] args) {
        String a="";
        a+=2;
        a+='c';
        a+=false;

        if (a=="2cfalse") System.out.println("==");
        if (a.equals("2cfalse"))System.out.println("equals");


        List<String> list=new ArrayList<String>();
        list.add("one");
        //list.add(7); String bir listeye int eklenmez. compiler Error verir

    }




}
