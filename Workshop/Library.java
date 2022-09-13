package Workshop;

import iteratorsAndComperators.Book;

import java.util.Arrays;
import java.util.Iterator;


public class Library implements Iterable<Book> {
    private Book[] books;


    public Library(Book... books) {
        this.books = books;
    }
    @Override
    public Iterator<Book> iterator(){
        return Arrays.stream(books).iterator(); // итератор на готово
//
//    @Override
//    public Iterator<Book> iterator() {
//        return new Iterator<>() {
//            private int index = 0;
//            @Override
//            public boolean hasNext() {
//                return index < books.length;
//            }
//
//            @Override
//            public Book next() {
//                return books[index++];
//            }
//        };
    }
}
