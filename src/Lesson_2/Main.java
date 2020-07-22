package Lesson_2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Задание 1.
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    // Задание 2.
    public static void fillArray() {
        int[] zeroMassive = new int[8];
        for (int i = 0; i < zeroMassive.length; i++) {
            zeroMassive[i] = i * 3;
        }
    }

    // Задание 3.
    public static void changeArray() {
        int[] w = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < w.length; i++) {
            if (w[i] < 6) {
                w[i] = w[i] * 2;
            }
        }
    }
    // Задание 4.
    public static void fillDiagonal() {
        int[][] diag = new int[5][5];
          for (int i = 0; i < 5; i++) {
              for (int j = 0; j < 5 ; j++) {
                 if(i == j || i == 0 && j == 4 || i == 1 && j == 3 || i == 3 && j == 1 || i == 4 && j == 0) {
                        diag[i][j] = 1;
                    }
                    System.out.print(" " + diag[i][j] + " ");
                }
                System.out.println();
            }
    }
    // Задание 5.
    public static void maxminArr() {
        Random random = new Random();
        int max = 0;
        int min = 50;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max);
        System.out.println(min);
    }





}



