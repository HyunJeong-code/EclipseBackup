package cooperation;

public class Subway {
	String lineNumber;
	int money;
	int passengerCount;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += 1500;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("����ö " + lineNumber + "���� �°��� " + passengerCount + "���̰�, ������ " + money + "�Դϴ�.");
	}
}
