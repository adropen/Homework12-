public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Иван", "Иванов" );
        Author author2 = new Author("Артур", "Артурович");
        Book book1 = new Book("Скайпро", author1, 2026);
        Book book2 = new Book("Мормышка", author2, 2025);
        book2.setYearOfPublication(2024);
        System.out.println("book1 = " + book1.getTitle());
        System.out.println("book1 = " + book1.getAuthor().getName() + " " + book1.getAuthor().getSurname());
        System.out.println("book1 = " + book1.getYearOfPublication());
        System.out.println("book2 = " + book2.getTitle());
        System.out.println("book2 = " + book2.getAuthor().getName() + " " + book2.getAuthor().getSurname());
        System.out.println("book2 = " + book2.getYearOfPublication());

    }
}