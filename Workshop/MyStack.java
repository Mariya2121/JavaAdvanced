package Workshop;

import javax.management.modelmbean.ModelMBean;
import java.util.Iterator;
import java.util.function.Consumer;

public class MyStack<E> implements Iterable<E> {

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = top;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E element = current.element;
                current = current.prev;
                return element;
            }
        };
    }



    private static class Node<Т> { // не е част от инстанциите
        private Т element;
        private Node<Т> prev;

        public Node(Т element, Node prev) {
            this.element = element;
            this.prev = prev;
        }
    }

    private Node<E> top;
    private int size;

    public MyStack() {

    }

    public void push(E element) {
        Node<E> newNode = new Node<>(element, this.top);
        this.top = newNode;
        this.size++;

    }

    public E pop() {
        ensureNotEmpty();
        E element = this.top.element;
        this.top = this.top.prev;
        this.size--;

        return element;
    }

    public E peek() {
        ensureNotEmpty();
        return this.top.element;

    }

//    public void forEach(Consumer<Е> consumer) {
//        ensureNotEmpty();
//
//        Node<Е> current = this.top;
//        while (current != null){
//            consumer.accept(current.element);
//            current = current.prev;
//        }
//
//    }

    private void ensureNotEmpty() {
        if (this.top == null) {
            throw new IllegalStateException("Cannot execute ot empty stack");
        }
    }
}
