package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student stduentJames = new Student("James", 5000);
		Student stduentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		stduentJames.takeBus(bus100);
		stduentJames.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2È£¼±");
		stduentTomas.takeSubway(subwayGreen);
		stduentTomas.showInfo();
		subwayGreen.showInfo();
	}
}
