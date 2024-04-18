package classes_and_objects_002.homework.task_4;

import classes_and_objects_002.homework.task_3.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car(2000);
        Car car3 = new Car(2002, 150);
        Car car4 = new Car(1999, 80, 1000);
        Car car5 = new Car(2010, 200, 1100, "Белый");

        System.out.println(car);
        System.out.println("===============");
        System.out.println(car2);
        System.out.println("===============");
        System.out.println(car3);
        System.out.println("===============");
        System.out.println(car4);
        System.out.println("===============");
        System.out.println(car5);
    }
}
