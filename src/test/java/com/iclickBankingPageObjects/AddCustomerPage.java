package com.iclickBankingPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
				
	}
	
	@FindBy(how = How.XPATH, using="//a[@href='addcustomerpage.php']")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(how = How.NAME, using="name")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how = How.NAME, using="rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how = How.ID_OR_NAME, using="dob")
	@CacheLookup
	WebElement txtDob;
	
	@FindBy(how = How.NAME, using="addr")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(how = How.NAME, using="city")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(how = How.NAME, using="state")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(how = How.NAME, using="pinno")
	@CacheLookup
	WebElement txtpinno;
	
	@FindBy(how = How.NAME, using="telephoneno")
	@CacheLookup
	WebElement txttelephone;
	
	@FindBy(how = How.NAME, using="emailid")
	@CacheLookup
	WebElement txtemailid;
	
	@FindBy(how = How.NAME, using="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(how = How.NAME, using="sub")
	@CacheLookup
	WebElement btnsubmit;
	
   
	public void clickAddnewCustomer()
	{
		lnkAddNewCustomer.click();
	}
	
	public void custName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	
	public void custGender(String cgender)
	{
		rdGender.click();
	}
	
	public void custDob(String dd,String mm, String yy)
	{
		txtDob.sendKeys(dd);
		txtDob.sendKeys(mm);
		txtDob.sendKeys(yy);
	}
	
	public void custaddress(String caddress)
	{
		txtaddress.sendKeys(caddress);
	}
	
	
	public void custcity(String ccity)
	{
		txtcity.sendKeys(ccity);
	}
	
	public void custstate(String cstate)
	{
		txtstate.sendKeys(cstate);
	}
	
	public void custpinno(String cpinno)
	{
		txtpinno.sendKeys(String.valueOf(cpinno));
	}
	
	public void custtelephoneno(String ctelephonno)
	{
		txttelephone.sendKeys(ctelephonno);
	}
	
	public void custemailid(String cemailid)
	{
		txtemailid.sendKeys(cemailid);
	}
	
	public void custpassword(String cpassword)
	{
		txtpassword.sendKeys(cpassword);
	}
	
	public void submit()
	{
		btnsubmit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
