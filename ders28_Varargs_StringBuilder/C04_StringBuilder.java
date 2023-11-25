package ders28_Varargs_StringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(7);
        // bu kodd yazildiginda java 7 karakter alabilecek bir string Builder olusturur

        System.out.println(sb.capacity());//7
        System.out.println(sb.length()); // hic bir deger atanmadigi icin 0

        sb.append("Java");
        System.out.println(sb);
        System.out.println(sb.capacity());//7
        System.out.println(sb.length());

        sb.append(" guzeldir.");
        System.out.println(sb); //java guzeldir
        System.out.println(sb.capacity()); //16
        System.out.println(sb.length()); //14

        sb.append(" ona ne suphe");
        System.out.println(sb); //Java guzeldir. ona ne suphe
        System.out.println(sb.capacity());//34 (16*2+2)
        System.out.println(sb.length());//27



        sb.trimToSize(); //kapasite ve lenght i esitlemek istersek
        System.out.println(sb.capacity()); //27
        System.out.println(sb.length()); //27
    }
}
