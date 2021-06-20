package queue;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//creating a queue
		Queue testQueue = new Queue();
		
		for (int i = 0; i < 110; i += 1) {
			testQueue.enqueue("hello");
			testQueue.dequeue();
		}
		
		Scanner scan = new Scanner(System.in);
		String[] words = scan.nextLine().split(" ");
		
		for (String word : words) {
			testQueue.enqueue(word);
		}
		
		while(testQueue.isEmpty() == false) {
			System.out.println(testQueue.dequeue());
		}
	}
}
