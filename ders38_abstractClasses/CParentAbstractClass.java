package ders38_abstractClasses;

public abstract class CParentAbstractClass {

    /*
    Abstract bir class abstract methodlara sahip olabilir
    bir class i abstract yapmak icin class declaration ana absract ketword eklenmelidir
     */

    public abstract void mecburiMethod1();

    public abstract void mecburiMethod2();
    public String concreteMethod(){
        return "";
    }
        /*
        bir parent class da child class larin mutlaka override edecegi bir method olusturdugumuzda
        method body si gereksizlesir
         */

    }



