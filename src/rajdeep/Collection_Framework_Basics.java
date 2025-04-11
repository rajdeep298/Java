package rajdeep;

import java.util.*;

public class Collection_Framework_Basics {
    public static void main(String[] args) {


        //Collection Framework is a set of classes and interfaces that implement commonly reusable collection data structures.
        //It contains interfaces like List, Set, Queue, Deque and classes like ArrayList, LinkedList, HashSet, LinkedHashSet, PriorityQueue, ArrayDeque etc.
        //Collection Framework is present in java.util package.
        //Collection Framework is used to store, retrieve, manipulate and communicate aggregate data.


        // ArrayList
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.add(2,25);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.size());
        System.out.println(list.contains(30));
        System.out.println(list.indexOf(30));
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
        System.out.println(list);

        // LinkedList
        LinkedList<Integer> list1=new LinkedList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);
        list1.add(2,25);
        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1);
        System.out.println(list1.get(2));
        System.out.println(list1.size());
        System.out.println(list1.contains(30));
        System.out.println(list1.indexOf(30));
        System.out.println(list1.isEmpty());
        list1.clear();
        System.out.println(list1.isEmpty());
        System.out.println(list1);

        // Stack
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.search(20));
        System.out.println(stack.isEmpty());
        stack.clear();
        System.out.println(stack.isEmpty());
        System.out.println(stack);

        // Queue
        Queue<Integer> queue=new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        queue.clear();
        System.out.println(queue.isEmpty());
        System.out.println(queue);

        // PriorityQueue
        PriorityQueue<Integer> queue1=new PriorityQueue<Integer>();
        queue1.add(10);
        queue1.add(20);
        queue1.add(30);
        queue1.add(40);
        System.out.println(queue1);

    }
}
