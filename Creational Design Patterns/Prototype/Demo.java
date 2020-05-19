package prototype.design.pattern;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bs = new BookShop();
		bs.setShopName("Book Shop");
		
		bs.loadData();
		
		
		BookShop bs1 = bs.clone();
		bs1.setShopName("The Book Shop");
		bs.getBooks().remove(2);
		System.out.println(bs.toString());
		System.out.println(bs1.toString());

	}

}
