package CH10;

public class PriorityAllocation implements scheduler {
	
	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��ų���� ���� �������� �켱������ ����մϴ�.");
	}

}
