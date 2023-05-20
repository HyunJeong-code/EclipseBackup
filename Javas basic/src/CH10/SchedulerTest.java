package CH10;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 할당 방식을 선택하시오.");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 짧은 상담원에게 할당");
		System.out.println("P : 우선 순위가 높은 고객 먼저 할당");
		
		int ch = System.in.read();
		scheduler sch = null;
		
		if(ch == 'R' || ch == 'r') {
			sch = new RoundRobin();
		}
		
		else if(ch == 'L' || ch == 'l') {
			sch = new LeastJob();
		}
		
		else if(ch == 'p' || ch == 'P') {
			sch = new PriorityAllocation();
		}
		
		else {
			System.out.println("지원하지 않는 기능입니다.");
		}
		
		sch.getNextCall();
		sch.sendCallToAgent();
	}

}
