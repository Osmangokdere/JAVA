package ders08_Ternary_Swich;

public class C08_SwichCase {
    public static void main(String[] args) {

        int ayNo=7;

        switch (ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("kıs");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("ilkbahar");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("ilkbahar");
                break;
            default:
                System.out.println("gecersiz");

        }
    }
}
