package ders28_Varargs_StringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java candir.");

        System.out.println(sb.capacity());//16+12=28
        System.out.println(sb.length());//12

        System.out.println(sb.reverse()); //.ridnac avaJ (Tersten yazdırma)
        sb.reverse();

        sb.replace(0,4,"Ahmet Hoca"); //Ahmet Hoca Candir.
        System.out.println(sb);
        sb.insert(18,"Bu bir yalandir"); //Ahmet Hoca candir bu bir yalandir.
        System.out.println(sb);

        String str="Java Cok Guzeldir";
        sb.insert(21,str,9,14);
        System.out.println(sb);


    }
}
