package ders11_stringManipulation;

public class C04_replacaAll {
    public static void main(String[] args) {
        // kullanicinin girdigi metinde
        //harf disinda kalan tum karakterleri temizleyen bir kod yazın
        //not space silinmemeli

        String input="Ja12+*/-5+va cok 1*guzel";

        input=input.replaceAll("\\d", ""); //Ja+va cok *guzel
        input=input.replace(" ", "5");//ja+va5cok5*guzel
        input=input.replaceAll("\\W","");//Java5cok5guzel
        input=input.replaceAll("_","");
        input=input.replaceAll("5"," ");//Java cok guzel
        input=input.replaceAll("\\s+"," ");
        //input=input.replaceAll("\\W", "");

        System.out.println(input);


    }
}
