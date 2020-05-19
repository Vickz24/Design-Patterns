package builder.design.pattern;

public class WoodenHouseBuilder implements HouseBuilder{

	private House house;
	
	public WoodenHouseBuilder()
	{
		this.house = new House();
	}
	
	@Override
	public void buildBasement() {
		this.house.setBasement("Wooden Poles");
		
	}

	@Override
	public void buildStructure() {
		this.house.setStructure("Forest Wood");
		
	}

	@Override
	public void buildInterior() {
		this.house.setInterior("Fire Wood");
		
	}

	@Override
	public void buildRoof() {
		this.house.setRoof("Wood Shed");
		
	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
