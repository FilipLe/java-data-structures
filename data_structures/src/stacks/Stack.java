package stacks;

public class Stack{
	String[] array = new String[100];
	int size = 0;
	
	void push(String inputData){
		array[size] = inputData;
		size+= 1;
	}
	
	String pop(){
		size -= 1;
		return array[size];
	}
	
	String isStackEmpty(){
		if(size == 0){
			return "Stack is empty";
		}
		else{
			return "Stack is not empty";
		}
	}
}

