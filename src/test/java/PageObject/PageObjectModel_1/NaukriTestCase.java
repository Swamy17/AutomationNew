package PageObject.PageObjectModel_1;

import org.testng.annotations.Test;

import com.page.basePage.MasterPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class NaukriTestCase extends MasterPage {
	
	
	NaukriHomePage homePage;
		
	public NaukriTestCase() {
		super();
	}

	
	@BeforeMethod
	    public void setUp() {
		initialization();
		homePage=new NaukriHomePage();//I have not gave reference initially i.e reason it is getting error.
		System.out.println("Class is updated");
		}
	
	
	@Test
	public void m1() throws InterruptedException
	{
	//Thread.sleep(2000);
		
		homePage.enterUserName();
	}
	
	@Test
	public void init()
	{
		System.out.println("Added a new method initilization");
	}
	@Test
	public void Begin()
	{
		System.out.println("Added a Begin Method");
		}
	
	@Test
	public void Start()
	{
		System.out.println("Added a new method initilization");
	}
}
