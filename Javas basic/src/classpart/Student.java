package classpart;

public class Student {
	//멤버변수
	int studentID;
	String studentName;
	int grade;
	String address;
	
//	public void showStudendInfo() {
//		System.out.println(studentName + ", " + address);
//	}
	
	//메서드
	public String getStudentName() {
		return studentName; // 학생의 이름을 반환하는 메서드
	}
	
	public void setStudentName(String name) { 
		studentName = name; //학생 이름을 부여하는 메서드
	}
	
//	public static void main(String[] args) {
//		Student studentAnn = new Student();
//		studentAnn.studentName = "안연수";
//		
//		System.out.println(studentAnn.studentName);
//		System.out.println(studentAnn.getStudentName());
//	}
}
