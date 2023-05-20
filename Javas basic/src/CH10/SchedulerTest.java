package CH10;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ��� �Ҵ� ����� �����Ͻÿ�.");
		System.out.println("R : �Ѹ� ���ʷ� �Ҵ�");
		System.out.println("L : ���� �ְų� ��Ⱑ ª�� �������� �Ҵ�");
		System.out.println("P : �켱 ������ ���� �� ���� �Ҵ�");
		
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
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
		
		sch.getNextCall();
		sch.sendCallToAgent();
	}

}
