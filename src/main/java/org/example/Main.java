package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();
        temp.add(12);
        temp.add(14);
        temp.add(15);
        temp.add(13);
        temp.add(17);
        for (Integer x : temp) System.out.println(x);


    }
}