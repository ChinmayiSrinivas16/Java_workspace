package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        // Heterogeneous List
        List<Object> list = new ArrayList<>();
        list.add("Upasana");
        list.add(13);
        list.add(true);
        list.add(12.55);
//        System.out.println(list);

        // String List
        List<String> list1 = new ArrayList<>();
        list1.add("Chinmayi");
        list1.add("Vaishnavi");
        list1.add("Harshitha");
        list1.add("CHIN");

//        System.out.println(list1);

        list1.remove(1);
//        System.out.println(list1);

        // Book List
        List<Book> bookList = new ArrayList<>();

        Book b2 = new Book(100, "Java", "James Gosling");
        bookList.add(b2);

        bookList.add(new Book(101, "Tell me your dreams", "Sidney Sheldon"));
//        System.out.println(bookList);

        bookList.add(new Book(102, "The Kite Runner", "Sawyer"));
//        System.out.println(bookList);

        // Iterator for Book list
        Iterator<Book> itr = bookList.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
