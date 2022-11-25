package com.actitimeproject.testscript;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitimeproject.pom.EnterTimeTrack;
import com.actitimeproject.pom.TaskList;
import com.acttimeproject.generic.BaseClass;
import com.acttimeproject.generic.FileLibClass;
@Listeners(com.acttimeproject.generic.Listenerimplementation.class)
public class CreateCustomer extends BaseClass{
	@Test
	public void CreatCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		Reporter.log("createcustomer",true);
		FileLibClass f=new FileLibClass();
		String expcustname =f.getExcelData("Sheet1", 1, 2);
		String despn =f.getExcelData("Sheet1", 1, 3);
		EnterTimeTrack e=new EnterTimeTrack(driver);
		e.setTask();
		TaskList t=new TaskList(driver);
//		t.getAdbtnbx().click();
//		t.getNewcustomtbx().click();
//    	t.getCusomernametbx().sendKeys(expcustname);
//		t.getDesciptiontbx().sendKeys(despn);
//		t.getSelecttbx().click();
//		t.getOurcompanytbx().click();
//		t.getCreatecustomertbx().click();	
		Thread.sleep(4000);
//		String actualname = t.getActualcreatcusttbx().getText();
//		Assert.assertEquals(actualname,expcustname);
}
}
