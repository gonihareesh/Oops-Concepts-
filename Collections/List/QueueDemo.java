package Collections.List;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo
{
    public static void main(String[] args) {
        //queue is interface and it store elements in first-in-first-out...
        Queue<String> queue = new PriorityQueue<>();
        queue.add("java");
        queue.add("SQL");
        queue.add("Java Script");
        queue.add("Salesforce");
        System.out.println("elements in the queue List: "+queue);
        System.out.println("removing queue "+queue.remove("Java Script"));
        System.out.println("After removing one elements: "+queue);
        //this peek() is used to retrive the elements
        System.out.println(queue.peek());
        //this poll() is removing elements in the queue
        System.out.println(queue.poll());
        System.out.println("After performing poll method: "+queue);


    }
}
