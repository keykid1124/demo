package com.offcn;

import java.util.ArrayList;
import java.util.List;

public class Listadd {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(0,"p");
        list.add(1,"a");
        list.add(2,"b");
        list.add(3,"c");
        list.add(4,"d");
        list.add(5,"e");
        list.add(6,"f");
        list.add(7,"g");
        Object[] objects = list.toArray();
        System.out.println(list.size()+"<<<<<<");
        for (Object object : objects) {
            System.out.println(object+"=====");
        }
        System.out.println(list);
        System.out.println(list.toString());
        String [] add={"a","b","c"};
        for(int i = 0 ;i<add.length;i++){
            System.out.println(add[i]);
        }
        System.out.println(add.hashCode());
        System.out.println(add.toString());
    }
}
