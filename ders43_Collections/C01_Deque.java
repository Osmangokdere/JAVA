package ders43_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {

        Deque<String> dq1=new LinkedList<>();
        dq1.add("K");
        dq1.add("B");
        dq1.addLast("F");
        dq1.addFirst("A");
        System.out.println(dq1.getFirst()); 

        System.out.println(dq1);

    }
}
