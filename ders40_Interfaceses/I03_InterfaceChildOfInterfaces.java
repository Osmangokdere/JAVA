package ders40_Interfaceses;

public interface I03_InterfaceChildOfInterfaces extends I01_Interface{

    //Eger bir ınterface i baska bir ınterface in Child i yapmak isterseniz
    //extens keyword kullanilir

    // bir interface concrete class INHERIT EDEMEZ


    void method1();
    //interface bir Child paretn interface deki
    //abstract methodu override edebilir ama
    //ikisinin de body si olmadigindan
    //islemin anlami yoktur

    int method4();
    boolean method5();

}

