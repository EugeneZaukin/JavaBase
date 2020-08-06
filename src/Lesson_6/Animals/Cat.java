package Lesson_6.Animals;

import Lesson_6.Main;

public class Cat extends Animal{
    public static int catCount = 0;
    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int catRun) {
        if(catRun >= 0 && catRun <= 200){
            System.out.println(name + " пробежал " + catRun + " м.");
        } else {
            System.out.println("Коты не могут столько пробежать!");
          }

    }
    public void swim(int catSwim) {
        System.out.println(name + " не умеет плавать!");
    }
}
