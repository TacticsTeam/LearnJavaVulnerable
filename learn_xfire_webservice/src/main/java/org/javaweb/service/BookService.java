package org.javaweb.service;

import org.javaweb.entry.Book;

/**
 * Created by huigou on 2017/10/12.
 */
public interface BookService {
    public Book getBookById(int id);
    public String sayHello(String str);
}
