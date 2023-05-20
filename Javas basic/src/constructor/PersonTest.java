package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person(); // new "Person()" -> 생성자!, 디폴트 생성자가 있어야 오류 안남(자바에서 자동으로 생성해주는 경우도 OK)
		
		personLee.name = "이길동";
		personLee.height = 180.0F;
		personLee.weight = 75.5F;
		
		Person personKim = new Person("김길동", 181.0F, 80.0F);
	}

}
