package ders46_Maps;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class deneme {
    public static void main(String[] args) {

        Map<String,String> kullaniciBilgileriMap=new HashMap<>();
        kullaniciBilgileriMap.put("isim", "mehmet");
        kullaniciBilgileriMap.put("hesap turu", "Usd");

        Map<String, String>hesapHareketleriMap=new HashMap<>();

        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());


    }}
