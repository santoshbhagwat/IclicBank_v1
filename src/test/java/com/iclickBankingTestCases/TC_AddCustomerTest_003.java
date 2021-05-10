package com.iclickBankingTestCases;

import java.io.IOException;
import org.testng.annotations.Test;

import com.iclickBankingPageObjects.AddCustomerPage;
import com.iclickBankingPageObjects.LoginPage;

import junit.framework.Assert;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddnewCustomer();
		
		addcust.custName("Rameshwari");
		addcust.custGender("female");
		addcust.custDob("26", "11", "1997");
		Thread.sleep(3000);
		addcust.custaddress("India");
		addcust.custcity("pune");
		addcust.custstate("Maharashtra");
		addcust.custpinno("431507");
		addcust.custtelephoneno("9923867540");
		
		String email=randomstring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.submit();
		
		Thread.sleep(5000);
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!123");
		
		if(res==true)
		{
			Assert.assertTrue(true);
		}
		
		else
		{
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
		
		
	}
	
	

}
