package problem_05_7;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(30, 12, 2023);
		System.out.println(date1.isVaild());
		MyDate date2 = new MyDate(29, 2, 2013);
		System.out.println(date2.isVaild());
		
		//결과값 밑에 true가 나온다..왜일까??
	}

}
