package classes_and_objects_002.homework.task_4;

public class Car {

    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {}

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
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
