package factoy.design.pattern;

public class FactoryMain {

	public static void main(String[] args) {
		
		OSFactory obj = new OSFactory();
		obj.getInstance("Open").specs();

	}

}
