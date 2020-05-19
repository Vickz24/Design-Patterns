package builder.design.pattern;

public class Builder {

	public static void main(String[] args) {
		HouseBuilder iglooBuilder = new IglooHouseBuilder();
		CivilEngineer engineer = new CivilEngineer(iglooBuilder);
		
		House myHouse = engineer.getHouse();
		System.out.println(myHouse);
	}

}
