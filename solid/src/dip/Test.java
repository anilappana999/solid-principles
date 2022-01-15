package dip;

public class Test {

	public static void main(String[] args) {
		Manager m = new  Manager();
		Employee e = new Architect();
		m.setEmp(e);
		m.manage();

	}

}
