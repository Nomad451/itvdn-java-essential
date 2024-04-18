package classes_and_objects_002.homework.task_3;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {}

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, int speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Год: " + year + "\n" +
                "Скорость: " + speed + "\n" +
                "Вес: " + weight + "\n" +
                "Цвет: " + color;
    }
}
