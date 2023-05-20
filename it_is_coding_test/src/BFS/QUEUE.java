package BFS;

import java.util.LinkedList;
import java.util.Queue;


public class QUEUE {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		// add, offer : ť�� ���� �߰��Ѵ�.
		// poll, remove : �� ���� �� �ϳ��� �����Ѵ�.
		// pop : ���� �տ� ���� �����Ѵ�. -> �ȵ�
		// clear : ť ��ü�� ����.
		// peak : ù ��° ���� �����Ѵ�.
		
		queue.add(1);
		queue.offer(2);
		queue.add(3);
		
		System.out.println(queue.peek()); // 1
		
		queue.add(4);
		
		queue.poll();
		
		System.out.println(queue.peek()); // 2
		
		queue.add(5);
		queue.remove();
		
		System.out.println(queue.peek()); // 3
		
		queue.clear();
		
		System.out.println(queue.poll()); // NULL
		
	}

}
