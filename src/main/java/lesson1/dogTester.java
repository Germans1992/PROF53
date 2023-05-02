package lesson1;

import org.w3c.dom.ls.LSOutput;

public class dogTester {
    public static void main(String[] args) {
        //конструктор по-умолчанию
        dog trezor = new dog();

//        trezor.age = 5;
//        trezor.name = "Trezor";
//        trezor.breed = "Bulldog";
//        trezor.color = "White";

        trezor.setAge(5);
        trezor.setName("Trezor");
        trezor.setBreed("Bulldog");
        trezor.setColor("White");

        System.out.println("Trezor breed is: " + trezor.getBreed());
        dog eleonora = new dog("Bolonka", "eleonora", 3, "white");
        System.out.println("Eleonora's age is: " + eleonora.getAge());

        eleonora.setAge(29);
        System.out.println("Eleonora's age is: " + eleonora.getAge());

        eleonora.bark();
        trezor.bark();

        System.out.println("Numbers of dogs: " + dog.numberOfDogs);

        dog.hello();


    }
}
// класс - объединение чего-либо по характерным признакам.
// класс - шаблон для описания его представителей (экземпляр)
// экземпляр - конкретный представитель
// класс - набор свойств и действий

// Модификаторы доступа
// если ничего не указывать, то доступ package private - эти поля видны только в пакете
// public - доступ к полю или методу имеют все классы отовсюду в проекте
// private - доступ имеют только методы этого класса
// protected - доступ имеют только методы класса и его наследники

class dog {
    //конструктор - нужен чтобы правильно инициализировать свойства экземпляра класса
//    public dog(String dogBreed, String dogName, int dogAge, String dogColor) {
//        breed = dogBreed;
//        name = dogName;
//        age = dogAge;
//        color = dogColor;
//    }

    public dog(String breed, String name, int age, String color) {
        // This - Текущий экземпляр класса
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public dog() {

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 30) {
            this.age = age;
        }
    }

    ;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // свойства - переменные класса == поля класса
    private String breed;
    private String name;
    private int age;
    private String color;

    //методы == функции == действия
    void bark() {
        System.out.println(name + " bark-bark!");
    }

    public static int numberOfDogs = 2;

    public static void hello() {
        System.out.println("Hello");
    }

}
