package Lesson_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Stuffer[] stArray = new Stuffer[5];
        stArray[0] = new Stuffer("Иванов", "Иван", "Иванович", "Начальник отдела кадров",
       "ivanov@mail.ru", 89137543678L, 120000, 45 );
        stArray[1] = new Stuffer("Петров", "Петр", "Петрович", "Специалист отдела кадров",
       "petrov@mail.ru", 89529675646L, 45000, 25);
        stArray[2] = new Stuffer("Александров", "Александр", "Александрович", "Заместитель начальника отдела кадров",
       "alex@mail.ru", 89134532387L, 100000, 41);
        stArray[3] = new Stuffer("Охлобыстин", "Сергей", "Евгеньевич", "Специалист отдела кадров",
       "oxlob@mail.ru", 89998765900L, 45000, 35);
        stArray[4] = new Stuffer("Бородач", "Евгений", "Викторович", "Специалист отдела кадров",
       "boroda@mail.ru", 89133215647L, 45000, 42);


        for (int i = 0; i < stArray.length; i++) {
           if(stArray[i].getAge() > 40) {
               stArray[i].info();
           }
        }
    }
}
