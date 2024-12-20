package Practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImplmentation.class)
//@Listeners(com.actitime.generic.ListenerImplmentation.class)
public class CustomerModule extends BaseClass{
@Test(groups = {"smokeTesing","RegressionTesting"})
public void createCustomer()
{
	Assert.fail();
	Reporter.log("createCustomer",true);
	}
@Test(groups = "RegressionTesting",dependsOnMethods = "createCustomer")
public void modifyCustomer()
{
	Reporter.log("modifyCustomer",true);
	}
@Test(groups = "RegressionTesting")
public void deleteCustomer()
{
	Reporter.log("deleteCustomer",true);
	}
}
