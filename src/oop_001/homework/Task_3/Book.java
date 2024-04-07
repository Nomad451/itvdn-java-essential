package oop_001.homework.Task_3;

public class Book {
    public static void main(String[] args) {

        Author author = new Author();
        Content content = new Content();
        Title title = new Title();

        // Записываем значения
        author.setAuthor("Гомер");
        content.setContent("Содержание книги...");
        title.setTitle("Иллиада");

        // Вызов метода show();
        author.show();
        content.show();
        title.show();
    }
}
