package Generics;

import java.util.ArrayDeque;

public class Jar<E> { // какъвто тип му подадем
    private ArrayDeque<E> elements;

    public Jar(){
        this.elements = new ArrayDeque<>();
    }

    public void add(E element) {
        this.elements.push(element);
    }

    public E remove() {
        return elements.pop();
    }
}
