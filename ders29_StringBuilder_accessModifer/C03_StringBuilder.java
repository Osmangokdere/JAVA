package ders29_StringBuilder_accessModifer;

public class C03_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("java ne kadar guzeldir");
        System.out.println(sb.substring(4)); //ne kadar guzeldir
        System.out.println(sb); //       java ne kadar guzeldir

        //sb=sb.substring(0,4) esitligin sou SttingBuilder,
        // sagı ise String  Java Non-Primiteve datalara casting yapmaz

        // sb guzel kelimesi iceriyor mu?
        /*
        StringBuilder de olmayan, String class inda bulunan methodları
        kullanmak isterseniz
        once toString ile String e cevirip sonra Sting manipulation yapılabilir

         */

        System.out.println(sb.toString().contains("guzel")); //true
        sb.setCharAt(5,'N');
        System.out.println(sb);
    }


}
