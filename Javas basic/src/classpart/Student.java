package classpart;

public class Student {
	//�������
	int studentID;
	String studentName;
	int grade;
	String address;
	
//	public void showStudendInfo() {
//		System.out.println(studentName + ", " + address);
//	}
	
	//�޼���
	public String getStudentName() {
		return studentName; // �л��� �̸��� ��ȯ�ϴ� �޼���
	}
	
	public void setStudentName(String name) { 
		studentName = name; //�л� �̸��� �ο��ϴ� �޼���
	}
	
//	public static void main(String[] args) {
//		Student studentAnn = new Student();
//		studentAnn.studentName = "�ȿ���";
//		
//		System.out.println(studentAnn.studentName);
//		System.out.println(studentAnn.getStudentName());
//	}
}
