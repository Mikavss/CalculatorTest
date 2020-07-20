package ru.lanit.testng;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите необходимое действие (+,-,/,*)");
        String Calculator = scanner.nextLine();
        System.out.println("Введите первое число: ");
        double x = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double y = scanner.nextDouble();

        switch (Calculator) {
            case "+":
                System.out.println("Результат: " + Math.sumTest(x, y));
                break;
            case "-":
                System.out.println("Результат: " + Math.diffTest(x, y));
                break;
            case "/": {
                if (y == 0) {
                    System.out.println("Нельзя делить на 0");
                } else {
                    System.out.println("Результат: " + Math.divTest(x, y));
                }
                break;
            }
            case "*":
                System.out.println("Результат: " + Math.multTest(x, y));
                break;
            default:
                System.out.println("Введена неверная операция. Попробуйте ещё раз.");
        }
    }
}
