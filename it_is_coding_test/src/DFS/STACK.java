package DFS;

import java.util.Stack;

public class STACK {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		System.out.println(stack.empty());
		
		// push : ���� �ִ´�. �Ʒ����� �״´�.
		// peek : ���� ���߿� ���� �� �ϳ��� ����.
		// search : Ư�� ��ġ�� ���� ã�´�.
		// pop : �� ���� ���� ����.
		
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
