package classes_and_objects_002.ex_008_static.methods;

public class Main {
    private int count;

    public static void main(String[] args) {
        // вызов статического метода с помощью класса
        Main.doSmth(); // через Класс
        doSmth();      // в самом классе, без использования класса

        // вызов не статического метода или поля из статического контекста запрещено и приводит к ошибке компиляции
        // System.out.println(Main.count);
    }
    public static void doSmth() {
        System.out.println("Hello !");
    }
}