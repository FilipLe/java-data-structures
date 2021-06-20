package queue;

public class Queue {
	String[] items = new String[100];
	int head = 0;
	int tail = 0;
	
	void enqueue(String item) {
		items[tail] = item;
		tail += 1;
		if(tail == items.length) tail = 0;
	}
	
	String dequeue() {
		String value = items[head];
		head += 1;
		if (head == items.length) head = 0;
		return value;
	}
	
	boolean isEmpty() {
		return head == tail;
	}
}
