package classes_and_objects_002.ex_005_constructors.private_constructor;

public class Animal {
    private int age;

    // Объявленный конструктор является приватным. Может быть использован только в рамках данного класса
    private Animal(int age) {
        this.age = age;
    }
}