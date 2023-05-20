package CH10;

public class RoundRobin implements scheduler {
	
	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 받습니다.");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
}
