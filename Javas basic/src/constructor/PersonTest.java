package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person(); // new "Person()" -> ������!, ����Ʈ �����ڰ� �־�� ���� �ȳ�(�ڹٿ��� �ڵ����� �������ִ� ��쵵 OK)
		
		personLee.name = "�̱浿";
		personLee.height = 180.0F;
		personLee.weight = 75.5F;
		
		Person personKim = new Person("��浿", 181.0F, 80.0F);
	}

}
