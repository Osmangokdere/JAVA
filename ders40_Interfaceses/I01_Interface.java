package ders40_Interfaceses;

public interface I01_Interface {
    //interface ler ozel yapi olduklarindan
    // yazilsa da yazilmasa da tum variabla ler
    // public static ve final dir
    String MESAJ="Hello Interface";
    static int SAYI=20;
    public static boolean GUZEL_MI=true;
    public static final int SAYI2=30;

    //Ayni sekilde tum methodlar
    //PUBLİC ve ABSTRACT dir.
    void method1();
    abstract int method2();
    public abstract String method3();
}
