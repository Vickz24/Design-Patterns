package builder.design.pattern;

public class IglooHouseBuilder implements HouseBuilder{

	private House house;
	
	public IglooHouseBuilder()
	{
		this.house = new House();
	}
	
	@Override
	public void buildBasement() {
		this.house.setBasement("Ice Bars");
		
	}

	@Override
	public void buildStructure() {
		this.house.setStructure("Ice Bblocks");
		
	}

	@Override
	public void buildInterior() {
		this.house.setInterior("Ice Carvings");
		
	}

	@Override
	public void buildRoof() {
		this.house.setRoof("Ice Dome");
		
	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
