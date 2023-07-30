package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	//add new button
	@FindBy(xpath = "//div[@class='title ellipsis']")
	private WebElement addnewcustomer;
	//customer and project search box
	@FindBy(xpath = "(//div[@class='cellWrapper'])[1]")
	private WebElement custAndProjSearchbx;
	//all customer search box
	@FindBy(xpath = "(//div[@class='cellWrapper'])[1]")
	private WebElement allcustSearchbx;
	//drop down new customer 
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newcustmer;
	//customer name text field
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement custNametxtFld;
	//customer description text field area
	@FindBy(xpath = "(//textarea[@placeholder='Enter Customer Description'])")
	private WebElement custdescriptiontxtarea;
	//copy project from existing customer drop down
	@FindBy(xpath = "//div[@class='comboboxButton']//div[@class='dropdownButton']")
	private WebElement existingcustdropdwn;
	//project elements from drop down
	@FindBy(xpath = "//div[@class='searchItemList']//div[text()='Big Bang Company']")
	private WebElement projectdrpdwn;
	//create customer button
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement creatcustbtn;
	
	//initialization
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewcustomer() {
		return addnewcustomer;
	}

	public WebElement getNewcustmer() {
		return newcustmer;
	}

	public WebElement getCustNametxtFld() {
		return custNametxtFld;
	}

	public WebElement getCustdescriptiontxtarea() {
		return custdescriptiontxtarea;
	}

	public WebElement getExistingcustdropdwn() {
		return existingcustdropdwn;
	}

	public WebElement getProjectdrpdwn() {
		return projectdrpdwn;
	}

	public WebElement getCreatcustbtn() {
		return creatcustbtn;
	}
	
	
	
	
	

}
