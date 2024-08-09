package org.example;

import java.util.Scanner;

public class Main {


    public static int length = 1;

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя");
        String name = scanner.nextLine();

        System.out.println("Введите возраст");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Введите навык");
        String skill = scanner.nextLine();

        System.out.println("Введите хобби");
        String hobby = scanner.nextLine();
*/
        /*Ovchinnikov chel = new Ovchinnikov("name", "skill", 26, "hobby");

        chel.favouriteMusic();

        Human human = new Human("hz", "no", 67);
        human.favouriteMusic();*/

        EgorSheep egorSheep = new EgorSheep();
        egorSheep.singing();

        EgorKringe egorKringe = new EgorKringe();
        egorKringe.singing();

    }
}