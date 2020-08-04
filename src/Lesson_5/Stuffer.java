package Lesson_5;

public class Stuffer {
     String surname, name, middleName, position, mail;
     long telephone;
     int salary, age;

    public Stuffer(String surname, String name, String middleName, String position, String mail, long telephone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.position = position;
        this.mail = mail;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println("ФИО: " + surname + " " + name + " " + middleName + "| Должномть: " +
        position + "| @mail: " + mail + "| Телефон: " + telephone + "| Зарплата: " +
        salary + "| Возраст: " + age);
    }

    public int getAge() {
        return age;
    }
}
