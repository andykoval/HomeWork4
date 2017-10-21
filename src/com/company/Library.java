package com.company;

import java.util.Arrays;

/**
 * Created by andy on 21.10.2017.
 */
public class Library {

    Book[] books;
    int[] qtys;
//    int size;

    public Library(int size) {
        books = new Book[size];
        qtys = new int[size];
    }

    void put(Book book, int qty) {
        if (books[books.length-1] != null) System.out.println("No free shelfs");
        else {
            for (int i = 0; i < books.length; i++) {
                if (books[i] != null) continue;
                books[i] = book;
                qtys[i] = qty;
                System.out.println("book put"+books[i]+" "+qtys[i]);
                break;
            }

        }
    }

    int get(Book book, int qty) {
        int result = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book) {
                if (qty >= qtys[i])
                    break;
                else result = qtys[i] - qty;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Sorokin", "Den' oprichnika", 280);
        Book book2 = new Book("Pelevin", "Omon Ra", 333);
        Book book3 = new Book("Ginzburg", "Ericsonovskiy gipnos", 520);
        Book book4 = new Book("Ilf i Petrov", "12 stul'ev", 290);
        Book book5 = new Book("H. Cortasar", "Igra v klassiki", 355);
        Library lib = new Library(4);
        lib.put(book1,20);
        lib.put(book2, 30);
        lib.put(book3, 25);
        lib.put(book4, 20);
        // пытаемся добавить книги но свободных полок нет
        lib.put(book5, 35);
        lib.get(book1,15);
        // берем с полки книги и видим остаток
        System.out.println(lib.get(book3,12));
        // запрашиваем больше книг чем есть в наличии на полке - получаем ноль
        System.out.println(lib.get(book4,40));


    }
}