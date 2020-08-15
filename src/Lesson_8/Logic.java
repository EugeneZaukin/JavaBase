package Lesson_8;

import javax.swing.*;
import java.util.Random;


public class Logic {
    static int SIZE;
    static int DOTS_TO_WIN;
    static final char DOT_X = 'x';
    static final char DOT_O = 'o';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Random random = new Random();

    static boolean isFinished;

    public static void go() {
        isFinished = true;

        printMap();
        if(checkWin(DOT_X)) {
            System.out.println("Ты победил!");
            JOptionPane.showMessageDialog(null, "Ты победил!");
            return;
        }
        if(isFull()) {
            System.out.println("Ничья!");
            JOptionPane.showMessageDialog(null, "Ничья!!!");
            return;
        }

        System.out.println();
        aiTurn();
        printMap();

        if(checkWin(DOT_O)) {
            System.out.println("Компьютер победил!");
            JOptionPane.showMessageDialog(null, "Компьютер победил!");
            return;
        }
        if(isFull()) {
            System.out.println("Ничья!");
            JOptionPane.showMessageDialog(null, "Ничья!!!");
            return;
        }
        System.out.println();

        isFinished = false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn(int x, int y) {
        if(isCellValid(y, x)) {
            map[y][x] = DOT_X;
            go();
        }
    }

    public static boolean isCellValid(int y, int x) {
        if(x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }
    public static boolean isFull() {
        for (int i = 0; i < SIZE ; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkLine(int cy, int cx, int vy, int vx, char dot) {
        if (cx + vx * (DOTS_TO_WIN - 1) > SIZE - 1 || cy +vy * (DOTS_TO_WIN - 1) > SIZE - 1 ||
             cy + vy * (DOTS_TO_WIN - 1) < 0) {
            return false;
        }

        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[cy + i * vy] [cx + i * vx] != dot) {
                return false;
            }
        }
        return true;
    }

    static boolean checkWin(char dot) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (checkLine(i, j, 0, 1, dot) || checkLine(i, j, 1, 0, dot) ||
                   checkLine(i, j, 1, 1, dot) || checkLine(i,j, -1, 1, dot)) {
                    return true;
                }
            }

        }
        return false;
    }
}

