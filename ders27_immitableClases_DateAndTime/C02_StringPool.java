package ders27_immitableClases_DateAndTime;

public class C02_StringPool {
    public static void main(String[] args) {
        String str1="java";
        String str2="java";
        String str3= new String("java");
        String str4="";
        str4="java";
        String str5="ja";
        str5=str5.concat("va");
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1 == str2); //true

        System.out.println(str1.equals(str3));//true
        System.out.println(str1==str3); //false

        System.out.println(str1.equals(str4)); //true
        System.out.println(str1 == str4); //true

        System.out.println(str1.equals(str5)); //true
        System.out.println(str1 == str5); //false

        /*
        == in true vermesi icin hem referans hemde adres ayni olmalidir
        Equals ise sadece degerlere bakar dolayısla surpriz yasamazsınız


        */

        System.out.println(str1=="java"); //true
        System.out.println(str3=="java"); //false
        System.out.println(str1=="j"+"a"+"v"+"a"); //true


    }
}
