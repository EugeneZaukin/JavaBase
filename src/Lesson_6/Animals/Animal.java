package Lesson_6.Animals;

import Lesson_6.Animals.Cat;
import Lesson_6.Animals.Dog;

public class Animal {
    String name;
    public static int allAnimals = 0;
    public Animal(String name) {
        this.name = name;
    }


    public void run(int run) {
        System.out.println(name);
    }

    public void swim(int swim) {
        System.out.println(name);
    }
}
