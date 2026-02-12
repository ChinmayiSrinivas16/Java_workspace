package com.example.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"chinmayi");
        map.put(102,"virat");
        map.put(103,"chinmayi");
        map.put(101,"dhoni");
        System.out.println(map);


    }
}
