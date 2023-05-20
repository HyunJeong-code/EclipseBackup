package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	// 생성자 입력 안하면 컴파일러가 자동으로 생성해줌
	public Person() {} // 디폴트 생성자
	
	public Person(String pname) {
		name = pname; // 사람 이름을 입력받아 Person 클래스를 생성하는 생성자
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
	}
}
