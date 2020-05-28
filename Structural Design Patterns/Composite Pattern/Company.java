package composite;

public class Company {

	public static void main(String[] args) {
		Developer dev1 = new Developer("Tony", 1001, "Developer");
		Developer dev2 = new Developer("Steve", 1002, "Pro Developer");
		
		CompanyDirectory enggDirectory = new CompanyDirectory();
		enggDirectory.addEmployee(dev1);
		enggDirectory.addEmployee(dev2);
		
		Manager man1 = new Manager("Nick", 100, "Product Manager");
		Manager man2 = new Manager("Rosa", 101, "Nick's Manager");
		
		CompanyDirectory accDirectory = new CompanyDirectory();
		accDirectory.addEmployee(man1);
		accDirectory.addEmployee(man2);
		
		CompanyDirectory directory = new CompanyDirectory();
		directory.addEmployee(enggDirectory);
		directory.addEmployee(accDirectory);
		directory.showEmployeeDetails();

	}

}
