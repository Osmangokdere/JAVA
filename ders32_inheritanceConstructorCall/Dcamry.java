package ders32_inheritanceConstructorCall;

public class Dcamry extends BToyota {

    Dcamry(String pc){
    super("Deniz");
        System.out.println("String parametreli Camry");
    }
    Dcamry(){

    }
    public static void main(String[] args) {
        Dcamry camry2=new Dcamry("celal");
        System.out.println("=======");
        Dcamry camry1=new Dcamry();
    }
}
