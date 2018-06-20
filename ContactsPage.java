package com.CRM.qa.Pages;

import org.openqa.selenium.By;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.CRM.qa.Util.TestUtil;
import com.CRM.qa.testbase.TestBase;

public class ContactsPage extends TestBase {
	TestUtil testUtil;
	
	
	@FindBy(name="cs_status")
	WebElement status;
	
	@FindBy(name="cs_category")
	WebElement category;
	@FindBy(name="cs_name")
	WebElement name;
	@FindBy(name="cs_company_name")
	WebElement companyName;
	@FindBy(name="cs_email")
	WebElement email;
	@FindBy(name="cs_extended")
	WebElement extended;
	@FindBy(name="cs_notes")
	WebElement notes;
	@FindBy(name="cs_industry")
	WebElement industry;
	@FindBy(name="by_user")
	WebElement owner;
	@FindBy(name="tags")
	WebElement tags;
	@FindBy(name="cs_address")
	WebElement address;
	@FindBy(name="cs_address_type")
	WebElement addresstype;
	@FindBy(name="cs_default_address")
	WebElement checkbox;
	@FindBy(name="view_id")
	WebElement viewid;
	@FindBy(name="cs_saved_search_id")
	WebElement savedsearch;
	@FindBy(name="cs_save_search")
	WebElement savesearch;
	@FindBy(xpath="//td[@class='datacardtitle']")
	WebElement contactLabel;
	@FindBy(xpath="//input[@name='contact_id']")
	WebElement selectcontact;
	
	@FindBy(xpath="//td[contains(text(),'title')]")
	WebElement title;
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstname;
	@FindBy(xpath="//input[@name='surname']")
	WebElement lastname;
	@FindBy(xpath="//input[@name='client_lookup']")
	WebElement company;
	
	@FindBy(xpath="//input[@type='submit'and @value='Save']")
	WebElement savebutton;
	
	// initialize Page
	public ContactsPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	//Action of the Page
	
	public boolean ContactLabel() {
		return  contactLabel.isDisplayed();
		
	}
	public void SelectContacts(String name){
		driver.findElement(By.xpath("//input[@name='contact_id']")).click();
		
		
	}
	
	public boolean Contactstatus() {
		
		return status.isSelected();
	}
	
	public boolean Categorystatus() {
		return category.isEnabled();
		
	}
	public void NameofContact() {
		name.sendKeys("Ade Rasaki");
		
	}
	
	public void CompanyName() {
		companyName.sendKeys("Sendrix Automation");
		
	}
	public void ContactsEmail() {
		
		email.sendKeys(prop.getProperty("Email"));
	}
	
	public void ExtendedFields() {
		extended.sendKeys("Nil");
	}
	
	public void ContactsNotes() {
		
		notes.sendKeys("New User");
	}
	
	public void ContactsIndustry() {
		
		industry.sendKeys("IT");
		
		
	}
	public void Owner() {
		owner.isSelected();
	}
	
	public void Tags() {
		
		tags.sendKeys("");
		
	}
	public void Address() {
		address.sendKeys("");
	}
	
	public boolean AddressType() {
		 return addresstype.isSelected();
	}
	
	public boolean CheckBox() {
		return checkbox.isSelected();
		
	}
	
	public void CreateNewContact(String title, String firstName, String lastName, String Company) {
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		
		//firstname.sendKeys("firstName");
		
		//lastname.sendKeys("lastName");

		//company.sendKeys("company");
		savebutton.click();
		
		
		
	}
	
	
		
	
	
	
	
	
	
	

}
