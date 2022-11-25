package com.actitimeproject.testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitimeproject.pom.EnterTimeTrack;
import com.actitimeproject.pom.TaskList;
import com.acttimeproject.generic.BaseClass;
import com.acttimeproject.generic.FileLibClass;
@Listeners(com.acttimeproject.generic.Listenerimplementation.class)
public class CreateProject extends BaseClass{
	@Test
	public void createProject() throws InterruptedException, AWTException, EncryptedDocumentException, IOException {
		FileLibClass f=new FileLibClass();
		String expproname = f.getExcelData("Sheet1", 2, 2);
		String descp = f.getExcelData("Sheet1", 2,3);
		EnterTimeTrack e=new EnterTimeTrack(driver);
		e.setTask();
		TaskList t=new TaskList(driver);
		t.getAdbtnbx().click();
		t.getNewprojectbtn().click();
		t.getProjectnametbx().sendKeys(expproname);
		t.getSelecttbx().click();
		t.getOurcompanytbx().click();
		t.getDescrptntbx().sendKeys(descp);
		t.getCreateprojectbtn().click();
		String actualproname = t.getAcutalproname().getText();
		Assert.assertEquals(actualproname,expproname);
	}
	
	
	
}
