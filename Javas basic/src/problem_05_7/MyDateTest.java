package problem_05_7;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 12, 2023);
		System.out.println(date1.isVaild());
		MyDate date2 = new MyDate(29, 2, 2013);
		System.out.println(date2.isVaild());
		
		//����� �ؿ� true�� ���´�..���ϱ�??
	}

}
