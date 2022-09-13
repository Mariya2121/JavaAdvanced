package WorkshopExcercise;

public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
       // System.out.println(list.removeLast());
      //  System.out.println(list.removeFirst());

        System.out.println(list.get(0));
        System.out.println(list.get(1));


        list.forEach(element -> System.out.println(element));
    }
}
