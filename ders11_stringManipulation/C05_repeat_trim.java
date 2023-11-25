package ders11_stringManipulation;

public class C05_repeat_trim {
    public static void main(String[] args) {
        String str="java guzeldir\n";
        System.out.println(str.repeat(4));
        //java guzeldir java guzeldir java guzeldir java guzeldir

        str="   java guzeldir   ";//19
        System.out.println(str.length());

        str=str.trim();

        System.out.println(str);//java guzeldir
        System.out.println(str.length());//13
    }
}
