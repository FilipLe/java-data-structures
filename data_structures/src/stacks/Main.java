package stacks;

public class Main{
	public static void main(String[] args){
		//creating a stack
		Stack testStack = new Stack();
		
		//testing push function
		testStack.push("hello");
		testStack.push("how");
		testStack.push("are");
		testStack.push("you");
		
		//testing pop function
		System.out.println(testStack.pop());
	}
}
