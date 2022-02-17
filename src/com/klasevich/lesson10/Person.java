package com.klasevich.lesson10;

public class Person {
    private final Integer id;

    public Person(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public boolean isCase(Object switchValue) {
        System.out.println("invoke isCase: " + switchValue);
        return false;
    }

    public boolean asBoolean() {
        return id > 10;
    }
}
