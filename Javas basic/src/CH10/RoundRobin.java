package CH10;

public class RoundRobin implements scheduler {
	
	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� �޽��ϴ�.");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ����մϴ�.");
	}
}
