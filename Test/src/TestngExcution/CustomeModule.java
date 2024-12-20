package TestngExcution;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.actitime.generic.BaseClass;
//@Listeners(com.actitime.generic.ListenerImplmentation.class)
//@Listeners(com.actitime.generic.ListenerImplmentation.class)
public class CustomeModule extends BaseClassTest {
	@Test(groups= {"smokeTest","RegressionTest"})
	public void createCustomer() {
		AssertJUnit.fail();
		Reporter.log("createCustomer", true);
	}
	
@Test(groups="RegressionTest",dependsOnMethods="createCustomer")
public void modifyCustomer() throws InterruptedException {
	Reporter.log("modifyCustomer", true);
}
@Test(groups = "RegressionTest")
public void deleteCustomer() {
	Reporter.log("deleteCustomer", true);
}
}
