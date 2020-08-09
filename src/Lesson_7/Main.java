package Lesson_7;

public class Main {
    public static void main(String[] args) {
        Cat[] cat = {new Cat("Тимофей", 20), new Cat("Барсик",15),
                new Cat("Кузя", 35), new Cat("Симба", 25),
                new Cat("Том", 10)};
        Plate plate = new Plate(100);

        for (int i = 0; i < cat.length; i++) {
            cat[i].info();
            cat[i].eat(plate);
            System.out.println();
        }
    }
}