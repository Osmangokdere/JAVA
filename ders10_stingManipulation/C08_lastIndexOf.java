package ders10_stingManipulation;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str= "java hafiften beyin yakıyor";
        str.lastIndexOf("a");
        System.out.println(str.lastIndexOf("a")); //21
        System.out.println(str.lastIndexOf('e')); //15
        System.out.println(str.lastIndexOf("java"));

    }
}
