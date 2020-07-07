package ru.lanit.testng;

public class Math {

    public static Object sumTest(Object two, Object tree) {
        System.out.println("Складываем "+ two + " и " + tree);
        return (Integer)two + (Integer)tree;
    }

    public static Object diffTest(Object two, Object tree) {
        System.out.println("Вычитаем "+ tree + " из " + two);
        return (Integer)two - (Integer)tree;
    }

    public static Object divTest(Object two, Object tree) {
        System.out.println("Делим "+ two + " на " + tree);
        return (Integer)two / (Integer)tree;
    }

    public static Object multTest(Object two, Object tree) {
        System.out.println("Умножаем "+ two + " на " + tree);
        return (Integer)two * (Integer)tree;

    }
}
