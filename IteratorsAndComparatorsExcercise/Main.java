package IteratorsAndComparatorsExcercise;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        Shelf shelf = new Shelf("Orange","Banana", "Apple");

        Iterator<String> shopGirl = shelf.iterator();

        while (shopGirl.hasNext()){
            System.out.println(shopGirl.next());
        }


    }
}
