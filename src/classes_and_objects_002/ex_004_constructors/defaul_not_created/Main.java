package classes_and_objects_002.ex_004_constructors.defaul_not_created;

public class Main {
    public static void main(String[] args) {
        // мы объявили конструктор с параметрами внутри класса Animal, поэтому конструктор по умолчанию создан не был.

        // при создании объекта без параметров - компилятор будет ругаться
         Animal animal = new Animal();
    }
}