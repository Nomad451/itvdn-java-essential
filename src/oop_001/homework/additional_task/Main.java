package oop_001.homework.additional_task;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса(объект) Address
        Address address = new Address();

        address.setIndex(142770);
        address.setCity("Москва");
        address.setCountry("Россия");
        address.setStreet("Ленинский проспект");
        address.setHouse("28");
        address.setApartment("50");

        // Вывод на экран
        System.out.println(address.toString());
    }
}
