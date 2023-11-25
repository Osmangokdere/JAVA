package ders39_abstractClass;

public abstract class Araba {

    //Araba classini inherit eden tum classlar
    //motor, kasa ve tekerlek metodlarini override etmek zorunda kalsin
    // ancak ABS ve Klima metodlari opsiyonel olsın
    //isteyen Child bu metodlar  override etssin istemeyen etmesin

    public abstract void motor();

    public abstract void marka();


    public abstract void kasa();


    public abstract void tekerlek();


    public void Abs(){
        System.out.println("guvenlik artırmak isteyen arabalar abs kullanmali");

    }
    public void klima(){
        System.out.println("konfor artirmak isteyen arabalar klima kullanmali");
    }

}
