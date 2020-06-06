package org.javaweb.entry;

/**
 * Created by huigou on 2017/10/12.
 */
public class Book {
    private Integer id;
    private String name;

    public Book(){}

    public Book(int bookId,String name){
        this.id = bookId;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
