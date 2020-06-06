package org.javaweb.service;

import org.javaweb.entry.Book;

/**
 * Created by huigou on 2017/10/12.
 */
public class BookServiceImpl implements  BookService {

    public Book getBookById(int id) {
        Book book = new Book(1,"book name");
        return book;
    }

    public String sayHello(String str) {
        return "Hello , " + str + ", \n This is a Book , How much money do you need to buy several books and study well before you can have more wisdom.";
    }

}
