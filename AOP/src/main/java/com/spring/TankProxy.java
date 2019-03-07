package com.spring;

public class TankProxy implements Move{
    //声明一个Move接口对象
    private Move t;

    public TankProxy(Move t) {
        this.t = t;
    }

    @Override
    public void move() {
        System.out.println("start");
        t.move();
        System.out.println("stop");
    }
}
