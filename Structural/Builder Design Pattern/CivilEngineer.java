package builder.design.pattern;

public class CivilEngineer {
	
	private HouseBuilder houseBuilder;
	
	public CivilEngineer(HouseBuilder hb)
	{
		this.houseBuilder = hb;
	}
	
	public void ConstructHouse()
	{
		this.houseBuilder.buildBasement();
		this.houseBuilder.buildStructure();
		this.houseBuilder.buildInterior();
		this.houseBuilder.buildRoof();
	}

	public House getHouse()
	{
		return this.houseBuilder.getHouse();
	}
}
