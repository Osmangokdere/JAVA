package ders13_forLoop;

public class C07_methodOlusturma {
    public static void main(String[] args) {

        String str = "Java muhtesemdir";

        // metni buyuk harfe cevirin

        String buyukStr = str.toUpperCase();

        System.out.println(str); // Java muhtesemdir

        System.out.println(buyukStr); // JAVA MUHTESEMDIR

        // metnin buyuk harflere cevrilmis hali S icerir mi ?

        System.out.println(buyukStr.contains("S")); // true

    }
}
