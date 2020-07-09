package ru.lanit.testng;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер необходимого действия: \n1 - Сложение \n2 - Вычитание \n3 - Деление \n4 - умножение");
        int Calculator = scanner.nextInt();
        System.out.println("Введите первое число: ");
        double x = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        double y = scanner.nextDouble();

        switch (Calculator) {
            case 1:
                System.out.println("Результат: " + Math.sumTest(x, y));
                break;
            case 2:
                System.out.println("Результат: " + Math.diffTest(x, y));
                break;
            case 3: {
                if (y == 0) {
                    System.out.println("Нельзя делить на 0");
                } else {
                    System.out.println("Результат: " + Math.divTest(x, y));
                }
                break;
            }
            case 4:
                System.out.println("Результат: " + Math.multTest(x, y));
                break;
            default:
                System.out.println("Введена неверная операция. Попробуйте ещё раз.");
        }
    }
}
