package bridge;

public class Bike extends Vehicle{

	protected Bike(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manufacture() {
		System.out.println("Bike");
		workshop1.work();
		workshop2.work();
		
	}

}
