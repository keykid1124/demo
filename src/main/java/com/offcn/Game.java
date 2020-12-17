package com.offcn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Game {
    @RequestMapping("/start")
    public Integer start(String name){
       Integer random =(int)(Math.random()*100+1) ;
        return random;
    }
    @RequestMapping("/test")
    public pojo test(int number,int random,String name,int time,int c,int b) {
        pojo pojo = new pojo();
        if (number == random) {
            pojo.setName(name);
            pojo.setC(c);
            pojo.setB(b);
            pojo.setTime(5-time);
            pojo.setMes("小"+name + "同学恭喜你答对 !!!!!!!");
            return pojo;
        } else if (number > random) {
            b = number;
            if ((5 - time) == 0) {
                pojo.setName(name);
                pojo.setC(c);
                pojo.setB(b);
                pojo.setTime(5-time);
                pojo.setMes("游戏结束！！");
                return pojo;
            } else {
                pojo.setName(name);
                pojo.setC(c);
                pojo.setB(b);
                pojo.setTime(5-time);
                pojo.setMes("大了哟！小" + name + "同学你还有" + (5 - time) + "次机会---" + "(" + c + "-" + b + ")");
                return pojo;
            }
        } else {
            c = number;
            if ((5 - time) == 0) {
                pojo.setName(name);
                pojo.setC(c);
                pojo.setB(b);
                pojo.setTime(5-time);
                pojo.setMes("游戏结束！！");
                return pojo;
            } else {
                pojo.setName(name);
                pojo.setC(c);
                pojo.setB(b);
                pojo.setTime(5-time);
                pojo.setMes("小了一点点！小" + name + "同学你还有" + (5 - time) + "次机会---" + "(" + c + "-" + b + ")");
                return pojo;
            }
        }

    }
}
