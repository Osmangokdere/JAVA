package ders25_staticKeyword;

public class Deneme {

    static int sayi=20;
    int yas=40;

    public Deneme(){

    }
    public void Deneme(){
        sayi++;
        yas++;
    }

    public static void main(String[] args) {
        Deneme obj1=new Deneme();
        Deneme obj2=new Deneme();
        System.out.println(obj2.sayi+ " "+obj2.yas);
    }
}
