package com.offcn;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Ran {
    public static void main(String[] args) {
        int[] a = {1,2, 3,4, 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33};
        int[] c = {1,2, 3,4, 5,6,7,8,9,10,11,12,13,14,15,16};
        int[]d={};
        Random random = new Random();
       /* Set set = new HashSet();

        for (;;){
            int i = random.nextInt(a.length);
            set.add(a[i]);
            if (set.size()==5){
                break;
            }
            }
        int g=1;
        for (Object o : set) {
            System.out.println("第"+g+"次出现红色球数字是"+o);
            g++;
        }*/
        for(;;){
            int i = random.nextInt(c.length);
            System.out.println("蓝色球："+i);
        }

    }
}


