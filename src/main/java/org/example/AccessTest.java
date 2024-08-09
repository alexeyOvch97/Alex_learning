package org.example;

public class AccessTest {
    public String value;
    public static int count = 0;

    public AccessTest (String value) {
        this.value = value;
        count++;
    }

    public void printValue () {
        System.out.println(value);

    }
}
