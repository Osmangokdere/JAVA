package ders30_Encapsullation;

public class EChild extends Dparent{
    /*
    Javadaki inheritance ın insalardan en buyuk farkı;
    insanlarda child parents edinebilir ama child parentini secemez

    java da ise tam tersidir
    -
     */

    public static void main(String[] args) {
        EChild child1=new EChild();
        child1.yas=30;
        child1.isim="Mahmut";
        child1.isEnough=false;
    }
}
