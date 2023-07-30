package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.pom.Homepage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generics.ListnerImplementation.class)
public class CustomerModule extends com.actitime.generics.Baseclass {
	
	
	
	@Test
	public void testcreatecustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Homepage h=new Homepage(driver);
		h.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddnewcustomer().click();
		t.getNewcustmer().click();
		
		t.getCustNametxtFld().sendKeys("HDFC_001");
		t.getCustdescriptiontxtarea().sendKeys("Banking project");
		t.getExistingcustdropdwn().click();
		t.getProjectdrpdwn().click();
		t.getCreatcustbtn().click();
		Reporter.log("createcustomer",true);
		Thread.sleep(3000);
	}
	
	
	
}
