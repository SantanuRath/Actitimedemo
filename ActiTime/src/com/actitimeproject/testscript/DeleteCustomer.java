package com.actitimeproject.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitimeproject.pom.EnterTimeTrack;
import com.actitimeproject.pom.TaskList;
import com.acttimeproject.generic.BaseClass;
@Listeners(com.acttimeproject.generic.Listenerimplementation.class)
public class DeleteCustomer extends BaseClass {
	@Test
	public void deleteCustomer() throws InterruptedException {
		EnterTimeTrack e=new EnterTimeTrack(driver);
		e.setTask();
		TaskList t=new TaskList(driver);
     	Thread.sleep(3000);
//		t.getHdfcbtn().click();
//		Thread.sleep(3000);
//		t.getEdirbtn().click();
//		Thread.sleep(3000);
//		t.getActnbtn().click();
//		t.getDeletbtn().click();
//		t.getDeltpermntlybtn().click();
	}
}
