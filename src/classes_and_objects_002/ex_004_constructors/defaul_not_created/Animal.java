package classes_and_objects_002.ex_004_constructors.defaul_not_created;

public class Animal {
    private int age;

    // создали конструктор с параметрами
    // конструктор по умолчанию создан не будет, пока Вы это не сделаете руками
    public Animal(int age) {
        this.age = age;
    }

    public Animal() {
    }
}