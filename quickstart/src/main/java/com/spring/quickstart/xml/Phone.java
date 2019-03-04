package com.spring.quickstart.xml;

public class Phone {
    private String name;
    private int money;
    private String color;

    public Phone(String name, int money, String color) {
        this.name = name;
        this.money = money;
        this.color = color;
    }

    public Phone() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", color='" + color + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.getName();
        phone.getMoney();
        phone.getColor();
    }
}
