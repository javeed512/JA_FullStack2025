package list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {


		Stack<Integer> stack =	new Stack<Integer>();
		

				stack.push(10);
				stack.push(20);
				stack.push(40);
				stack.push(10);
				
				System.out.println(stack);
				
				stack.pop();
				
				System.out.println(stack);
				
				System.out.println(stack.peek());
		
	}

}
