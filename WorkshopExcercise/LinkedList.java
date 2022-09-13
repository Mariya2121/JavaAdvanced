package WorkshopExcercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LinkedList {
    private Node head;
    private int size;

    public void addFirst(int number) {
        //1. Create the new Node
        Node newNode = new Node(number);

        if (!isEmpty()) {
            newNode.next = this.head;
        }

        //2.Node is our new head
        this.head = newNode;

        //3. Increment size
        this.size++;
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot remove from empty list");
        }
        int result = head.value;
        this.head = head.next;
        this.size--;

        return result;
    }

    public void addLast(int number) {
        if (isEmpty()) {
            addFirst(number);
            size++;
            return;
        }
        Node newNode = new Node(number);
        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
        size++;
    }

    public int removeLast() {
        if (size < 2) {
            return removeFirst();
        }

        int result = 0;
        Node currentNode = head;

        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }

        result = currentNode.next.value;
        currentNode.next = null;
        size--;

        return result;
    }

    public int get(int index) {
        checkIndex(index);
        int result = 0;
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }

    public void forEach(Consumer<Integer> consumer) {
        Node currentNode = head;
        while (currentNode != null) {
            consumer.accept(currentNode.value);
            currentNode = currentNode.next;
        }

    }

    public int[] toArray() {
        int[] arr = new int[size];
        int counter = 0;
        Node currentNode = head;
        while (currentNode != null) {
            arr[counter] = currentNode.value;
            currentNode = currentNode.next;
            counter++;
            currentNode = currentNode.next;
        }
        return arr;
    }

//    public int[] toArray() {
//        List<Integer> result = new ArrayList<>();
//        forEach(result::add);
//
//        return result.stream().mapToInt(e -> e).toArray();
//    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("No such index in the Linked list");
        }
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }
}
