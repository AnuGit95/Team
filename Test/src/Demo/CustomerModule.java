package Demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test(priority=0,invocationCount=1)
	public void CreateCustomer() {
		Assert.fail();
		Reporter.log("CreateCustomer", true);
	}
	@Test(priority=0,dependsOnMethods="CreateCustomer")
	public void ModifyCustomer() {
		Reporter.log("ModifyCustomer", true);
	}
	@Test()
	public void deleteCustomer() {
		Reporter.log("deleteCustomer", true);
		
		}
	}
