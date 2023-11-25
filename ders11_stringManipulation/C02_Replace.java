package ders11_stringManipulation;

import java.lang.module.FindException;

public class C02_Replace {
    public static void main(String[] args) {

        String str="java candir";
        System.out.println(str.replace('a', 'A'));

        System.out.println(str.replace(' ', '_'));
        System.out.println(str.replace("candir", "cok guzeldir"));  //candir

        System.out.println(str.replace("a", ""));//tum a lari sil

        System.out.println(str.replace("java", "hava").replace("candir", "cok guzeldir")); //hava cok guzeldir
        //sadece 1.a yi A yapın

        System.out.println(str.replace("","_")); //_j_a_v_a_ _c_a_n_d_i_r_

        System.out.println(str.replaceFirst("a", "A"));//jAva candir



    }
}
