package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	// ������ �Է� ���ϸ� �����Ϸ��� �ڵ����� ��������
	public Person() {} // ����Ʈ ������
	
	public Person(String pname) {
		name = pname; // ��� �̸��� �Է¹޾� Person Ŭ������ �����ϴ� ������
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
