package ders46_Maps;

import java.util.HashMap;
import java.util.Map;

public class C_PutIfAbsand {
    public static void main(String[] args) {
        Map<String,Integer> mp1=new HashMap<>();
        mp1.put("A",5);
        mp1.put("B",3);
        mp1.put("C",7);
        System.out.println(mp1.putIfAbsent("D", 9));
        System.out.println(mp1);

        System.out.println(mp1.putIfAbsent("D", 15));

        Map<Integer,String> mp2=new HashMap<>();
        mp2.putIfAbsent(2,"S");
        System.out.println(mp2.putIfAbsent(3, "K"));
        System.out.println(mp2);


        mp1.computeIfPresent("B",(k,v)->2*v);
        System.out.println(mp1);

        mp1.computeIfPresent("B",(k,v)->v-3);
        System.out.println(mp1);

        mp1.computeIfAbsent("E", v->8);
        //mp1.compute("F",(k,v)->v*9);

        mp1.replace("C", 10);
        System.out.println(mp1); //{A=5, B=3, C=10, D=9, E=8}


    }
}
