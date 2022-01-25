package books;

import books.models.Book;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Book> book = new ArrayList<>();

        book.add(new Book("Java 8 in  Action", "Gabriel Urma"));
        book.add(new Book("Java Se8", "Gay S Horstmann"));
        book.add(new Book("Java Coding", "Anghel Leopard"));
        book.add(new Book("Java 8 Lambdas", "Richard Warburton"));
        book.add(new Book("Java 8 Pocket Guide", "Robert Liguori"));

        System.out.println("список книги:");
        for (Book b: book){
            System.out.println(b);
        }
        System.out.println("______________________________________________");

        book.remove(4);
        System.out.println("список книги после удаление последний книг");
        for (Book b: book){
            System.out.println(b);
        }



        System.out.println("__________________________________________________");
        System.out.println("список книги после замены книг");
        book.set(3, new Book("JDK", "XZ"));
        for (Book b: book){
            System.out.println(b);
        }
        System.out.println("___________________________________________________");
        System.out.println("последний добавленный книг");
        System.out.println(book.get(3));
        System.out.println("____________________________________________________");
        System.out.println("после очистки");
        book.clear();
        for (Book b: book){
            System.out.println(b);
        }
        System.out.println("____________________________________________________");
        System.out.println("после добавление 3 книги");
        book.add(new Book("Becoming Function", "Joushua Backfield"));
        book.add(new Book("Java философия", "Эккель Брюсь"));
        book.add(new Book("Java полное руководство", "Герберт Шилдт"));
        for (Book b: book){
            System.out.println(b);
        }
    }
}
