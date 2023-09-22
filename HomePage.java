package inheritenceDemeo;

public class HomePage extends BaseClass {
	public void Homepagetest() {
		System.out.println("test for home page");
	}
	
	public static void main (String args[]) {
		
		HomePage obj = new HomePage();
		obj.openbrowser("Chrome");
		obj.login("admin","admin");
		obj.Homepagetest();
		obj.logut();
		
		
	}

}
