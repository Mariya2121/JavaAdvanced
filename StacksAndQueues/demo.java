package StacksAndQueues;

import java.util.*;

public class demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int[] arr = {10, 15, 30, 40};
//
//        int element = Integer.parseInt(scanner.nextLine());
//
//        int index = -1;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == element){
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);
//
//        // Measure memory
//        int memory = Integer.BYTES * arr.length;
//        System.out.println(memory);
//
//        List<Integer> list = new ArrayList<>();
//        ArrayList<Integer> list1 = new ArrayList<>();
//
//        ArrayDeque<Integer> stack = new ArrayDeque<>();
//
//        stack.push(15);
//        stack.push(11);
//        stack.push(30);
//
//        int topElement = stack.peek();
//        System.out.println(topElement);

        //Priority  Queue

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.offer(16);
        priorityQueue.offer(10);
        priorityQueue.offer(1);
        priorityQueue.offer(78);

        while (!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }
    }
}
