package org.example;

public class Human {
    protected String name;
    protected String skill;
    protected int age;

    public Human(String name, String skill, int age) {
        this.name = name;
        this.skill = skill;
        this.age = age;
    }

    public void favouriteMusic () {
        System.out.println("some sound");
    }
}
