package day30_collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		//To create a Queue you can use LinkedList or PriorityQueue
		Queue<String> queue = new LinkedList<String>();
		
		//To add elements
		queue.add("A");
		queue.add("D");
		queue.add("C");
		queue.add("B");
		System.out.println(queue);//[A, D, C, B]
		
		//To remove an element use remove();
		queue.remove(); //It will remove A (FIFO)
		System.out.println(queue);//[D, C, B]
		
		queue.remove();//It will remove D (FIFO)
		System.out.println(queue);//[C, B]
		
		//To get the head of the Queue (first element) use element() ==> copy+paste
		System.out.println(queue.element()); //C
		
		//To remove and get the first element use poll() ==> Similar to  cut+paste
		System.out.println(queue.poll()); //C
		System.out.println(queue);// [B]
		
		//To get the first element use peek()
		//peek() similar to element(); but peek() returns null if the Queue is empty.
		System.out.println(queue.peek());//B
		System.out.println(queue);//[B]
		queue.remove();//The queue is empty
		System.out.println(queue.peek());//null
		//System.out.println(queue.element());// If you use element() for an empty queue
		                                    // you will get NoSuchElementException
	
	}

}
