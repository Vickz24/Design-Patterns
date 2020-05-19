package singleton.design.pattern;

public class Abc {
	
	static Abc obj = new Abc();
	
	private Abc()
	{
		
	}
	
	public static Abc getInstance()
	{
		return obj;
	}

}