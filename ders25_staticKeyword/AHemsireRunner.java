package ders25_staticKeyword;

public class AHemsireRunner {

    public static void main(String[] args) {

        AHemsire h1=new AHemsire();

        System.out.println(h1);

        h1.personelIsim="Ayşe Hemsire";
        h1.personelAdresi="Ulus";
        h1.personelTelefon="3122565656";
        System.out.println(h1);

        AHemsire h2=new AHemsire();
        System.out.println(h2);
        h2.personelIsim="Hatice";
        h2.personelAdresi="sincan";
        h2.bashekimIsmi="Yasar Kemal";

        System.out.println("h1 :" +h1);
        System.out.println("h2 : " +h2);

        AHemsire h3=new AHemsire();
        System.out.println("h3 : "+h3);
        h3.hastaneIsmi="java Hastanesi";
        System.out.println(h3);
    }
}
