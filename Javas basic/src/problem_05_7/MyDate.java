package problem_05_7;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	
	public MyDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isVaild() {
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			if(day < 1 || day > 31) {
				System.out.println("Error!!");
			} else {
				System.out.println("Day is vaild.");
			}
			break;
		case 2 : 
			if(day < 1 || day > 28) {
				System.out.println("Error!!");
			} else {
				System.out.println("Day is vaild.");
			}
			break;
		case 4: case 6: case 9: case 11: 
			if(day < 1 || day > 30) {
				System.out.println("Error!!");
			} else {
				System.out.println("Day is vaild.");
			}
			break;
		}
		return true;
	}
}
