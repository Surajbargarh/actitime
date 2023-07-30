package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(id = "addTaskButtonId")
	private WebElement newuser;

	@FindBy(xpath = "(//input[@placeholder='Enter task name'])[1]")
	private WebElement entertaskname;

	@FindBy(xpath = "//div[text()='Create Tasks']")
	private WebElement createtaskbtn;

	@FindBy(id = "logoutLink")
	private WebElement logout;

	@FindBy(id = "container_tasks")
	private WebElement tasktabElement;

	@FindBy(xpath = "//a[contains(@class,'userProfile')]")
	private WebElement profilename;

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
    //logout link 
	public void setLogout()
	{
		logout.click();
	}
    //profile name link
	public String profilename()
	{
		return profilename.getText();
	}

	// tasks link to enter task list page
	public void setTaskTab() 
	{
		tasktabElement.click();
	}
	
}
