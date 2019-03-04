package com.spring;

import java.util.List;

public class Boss {
    private String name;
    private String Company;
    private List<String> hobbies;
    private Car car;

    public Boss(String name, String company, List<String> hobbies, Car car) {
        this.name = name;
        Company = company;
        this.hobbies = hobbies;
        this.car = car;
    }

    public Boss() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", Company='" + Company + '\'' +
                ", hobbies=" + hobbies +
                ", car=" + car +
                '}';
    }
}
