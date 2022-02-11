package restAPIProjectC;

public class overidding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Father{
	
	public void home(){
		System.out.println("Father's home");
	}
	public void car(){
		System.out.println("Father's Car");
	}	
}
class Son extends Father{
	
	@Override
	public void car() {
		System.out.println("Son's Car");		
	}	
}
class TestOverriding {

	public static void main(String[] args) {
		
		Son s = new Son();
		s.home();
		s.car();
	}

}


