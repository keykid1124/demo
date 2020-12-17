package com.offcn;

public class pojo {
    private String name;
    private int c;
    private  int b;
    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    private String mes;

    public pojo() {
    }

    public pojo(String name, int c, int b,String mes,int time) {
        this.name = name;
        this.c = c;
        this.b = b;
        this.mes = mes;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
