package BFS;

import java.util.LinkedList;
import java.util.Queue;


public class QUEUE {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		// add, offer : 큐에 값을 추가한다.
		// poll, remove : 맨 앞의 값 하나를 제거한다.
		// pop : 가장 앞에 값을 제거한다. -> 안됨
		// clear : 큐 전체를 비운다.
		// peak : 첫 번째 값을 참조한다.
		
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
