package builder.design.pattern;

public interface HouseBuilder {
	
	public void buildBasement();
	public void buildStructure();
	public void buildInterior();
	public void buildRoof();
	public House getHouse();

}
