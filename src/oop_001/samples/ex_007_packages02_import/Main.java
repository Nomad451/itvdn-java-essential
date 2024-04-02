package oop_001.samples.ex_007_packages02_import;

import oop_001.samples.ex_001_class_declaration.Car;

public class Main {
    public static void main(String[] args) {
        // Если класс (Машина) лежит в другом пакете, то чтобы его использовать в классе Main - его надо импортировать
        Car myCar = new Car();
    }
}
