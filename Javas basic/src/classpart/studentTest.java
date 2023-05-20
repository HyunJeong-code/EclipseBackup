package classpart;

public class studentTest {

	public static void main(String[] args) {
		Student studentAnn = new Student();
		studentAnn.studentName = "¾È¿¬¼ö";
		
		System.out.println(studentAnn.studentName);
		System.out.println(studentAnn.getStudentName());
	}

}
