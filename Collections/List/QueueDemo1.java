package Collections.List;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo1
{
    public static void main(String[] args) {
        //queue works on fifo
        //priorityQueue is
        Queue<String> queue=new PriorityQueue<>();
       // queue.add("Arrays");
        queue.add("Iterable");
        queue.add("Collection");
        queue.add("List");
        queue.add("");
        queue.add("List");
        queue.add("Queue");
        queue.add("PriorityQueue");
        System.out.println("Head elements: "+queue.element());
        System.out.println("Head peek "+queue.peek());
        Iterator<String> it=queue.iterator();
           while(it.hasNext()){
               System.out.println(it.next());
           }
        }
    }

