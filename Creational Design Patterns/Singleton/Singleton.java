package singleton.design.pattern;

public class Singleton {
	
	public static void main(String[] args) {
	
		Abc a = Abc.getInstance();
		
		Abc b = Abc.getInstance();
		
		System.out.println(a==b);
	}
	
}
