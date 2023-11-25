package ders22_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Soru {
    public static void main(String[] args) {
        String[] arr= {"Sumeyra", "Mehmet Ahmet" , "Ekram", "Yilmaz"};

        List<String> yeniList=new ArrayList<>();

        for (String each:arr
             ) {

            if (each.length()%2==0){
                yeniList.add(each.substring(0,each.length()/2));
           }else{
                yeniList.add(each.substring((each.length()-1)/2));
            }



        }
        System.out.println(yeniList);



    }
}
