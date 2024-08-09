package org.example;

public class Ovchinnikov extends Human {
    private String hobby;
    public Ovchinnikov(String name, String skill, int age, String hobby) {
        super(name, skill, age);
        this.hobby = hobby;
        System.out.println("Этот человек: " + name + ", " + age + ", " + skill + ", " + hobby);
    }

   /* @Override
    public void favouriteMusic() {
        System.out.println("Рэпчик");
    }*/
}

