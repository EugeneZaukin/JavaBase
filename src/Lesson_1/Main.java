package Lesson_1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        byte z = 126;
        short x = -32768;
        int v = 10;
        long m = 200000;
        float ex = 15.55f;
        double reb = 234.567;
        char t = '?';
        boolean y = true;
    }

    public static float three(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean four(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    public static int five(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
        return a;
    }

    public static boolean six(int a) {
        if (a >= 0) {
        return false;
    } else {
        return true;
        }
    }

    public static void seven(String name) {
        System.out.println("Привет" + " " + name);
    }

    public static int eight(int a) {
        if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год невисокосный");
        }
        return a;
    }
}
