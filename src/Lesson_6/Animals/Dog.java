package Lesson_6.Animals;

import Lesson_6.Main;

public class Dog extends Animal{
    public static int dogCount = 0;
    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int dogRun) {
        if(dogRun >= 0 && dogRun <= 500){
           System.out.println(name + " пробежал " + dogRun + " м.");
        } else {
           System.out.println("Собаки не могут столько пробежать!");
          }
    }
    public void swim(int dogSwim) {
        if(dogSwim >= 0 && dogSwim <= 10){
            System.out.println(name + " проплыл " + dogSwim + " м.");
        } else {
            System.out.println("Собаки не плавают больше 10 м.");
        }
    }
}
