package com.lym.springannotation.bean;

public class Car {

    public Car() {
        System.out.println("Car constructor");
    }

    public void init() {
        System.out.println("初始化。。。。");
    }

    public void destroy() {
        System.out.println("销毁。。。。");
    }
}
