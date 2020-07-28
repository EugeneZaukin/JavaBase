package Lesson_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        //game1();
        //game2();

    }
    // Задание 1.
    public static void game1() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(10);
        int i;
        System.out.println("Введите число от 0 до 9");
        int b = sc.nextInt();
        for (i = 1; i < 3; i++) {
            if(b == a) {
                System.out.println("Вы победили!\nПовторить игру? 1 - да; 0 - нет");
                break;
            } if (b > a) {
                System.out.print("Ваше число больше загадонного. ");
            } if (b < a) {
                System.out.print("Ваше число меньше загадонного. ");
            }
            System.out.println("Попробуйте снова");
            b = sc.nextInt();
        }
        if(i == 3) {
            System.out.println("Вы проиграли!\nПовторить игру? 1 - да; 0 - нет");
        }
        b = sc.nextInt();
        if(b == 1) {
            game1();
        }
    }

    public static void game2() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(Arrays.toString(words));
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int i = random.nextInt(words.length);
        String word1 = words[i];
        //System.out.println(word1);
        String symbol = "###############";
        //System.out.println(symbol);
        char a = symbol.charAt(0);
        char b = word1.charAt(0);
        System.out.print("Попробуйте отгадать загаданное слово: ");
        String answer = sc.nextLine();
        char c = answer.charAt(0);
        //
        if(answer.equals(word1)) {
            System.out.println("Вы отгадали!");
        }
    }

}

