package Generics;


public class Scale<T extends Comparable<T>> { // T трябва да е такъв вид на някакъв вид сравними обекти от Т
    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier() {
        if (left.compareTo(right) > 0) {
            return left;
        }
        else if (right.compareTo(left) > 0){
            return right;

        }
        return null;
    }
}
