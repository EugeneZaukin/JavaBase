package Lesson_6;

import Lesson_6.Animals.*;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Тима");
        Dog dog = new Dog("Шарик");

        //Dog dog2 = new Dog("Каштанка");
        //Cat cat2 = new Cat("Мяу");          //для проверки подсчета животных
        //Dog dog3 = new Dog("Гав");

        Animal.allAnimals = Cat.catCount + Dog.dogCount;

        cat.run(157);
        dog.run(435);
        cat.swim(0);
        dog.swim(5);

        //System.out.println(Cat.catCount);
       // System.out.println(Dog.dogCount);    //для проверки подсчета животных
        //System.out.println(Animal.allAnimals);
    }
}
