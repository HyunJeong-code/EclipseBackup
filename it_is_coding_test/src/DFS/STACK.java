package DFS;

import java.util.Stack;

public class STACK {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		System.out.println(stack.empty());
		
		// push : 값을 넣는다. 아래부터 쌓는다.
		// peek : 가장 나중에 넣은 값 하나를 본다.
		// search : 특정 위치의 값을 찾는다.
		// pop : 맨 위의 값을 뺀다.
		
		for(int i = 0; i < 10; i++) {
			stack.push(i);
			System.out.println(stack.peek());
		}
		
		stack.pop();
		System.out.println("pop()");
		System.out.println(stack.peek());
		System.out.println(stack.search(5));
		System.out.println(stack.empty());
	}

}
