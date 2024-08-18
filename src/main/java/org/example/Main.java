package org.example;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        Double firstInt = scanner.nextDouble();

        System.out.println("Введите второе число");
        String secondInt = scanner.next();


        System.out.println("Введите номер операции: \n 1 - Сложение \n 2 - Вычитание  \n 3 - Умножение");
        Integer operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Результат: " + (firstInt + Double.valueOf(secondInt)));
                break;
            case 2:
                System.out.println("Результат: " + (firstInt - Double.valueOf(secondInt)));
                break;
            case 3:
                System.out.println("Результат: " + (firstInt * Double.valueOf(secondInt)));
                break;
            default:
                System.out.println("Операция неопределена");
        }

    }
}