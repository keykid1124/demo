package com.offcn;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Test {
    @RequestMapping("/game")
    public String game(String name){
        Scanner scanner = new Scanner(System.in);
        int random =(int)(Math.random()*100+1) ;
      /*  System.out.println("小"+name+"同学幸运号码已经生成，你想猜几次呢？");
        int s = scanner.nextInt();*/
        int c=0;
        int b=100;

        return null;
    }
}
