package com.actitimeproject.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
//	
@FindBy(xpath="//div[text()='Add New']")
private WebElement adbtnbx;
//@FindBy(xpath="//div[text()='+ New Customer']")
//private WebElement newcustomtbx;
//@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
//private WebElement cusomernametbx;
//@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
//private WebElement desciptiontbx;
//@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
//private WebElement selecttbx;
//@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
//private WebElement ourcompanytbx;
//@FindBy(xpath="//div[text()='Create Customer']")
//private WebElement createcustomertbx;
//@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
//private WebElement actualcreatcusttbx;
//@FindBy(xpath="//div[text()='HDFC_001']")
//private WebElement hdfcbtn;
//@FindBy(xpath="//div[@title='HDFC_001']/..//div[@class='editButton']")
//private WebElement edirbtn;
//@FindBy(xpath="(//div[text()='ACTIONS'])[1]")
//private WebElement actnbtn;
//@FindBy(xpath="(//div[text()='Delete'])[2]")
//private WebElement deletbtn;
//@FindBy(xpath="//span[text()='Delete permanently']")
//private WebElement deltpermntlybtn;
@FindBy(xpath="//div[text()='+ New Project']")
private WebElement newprojectbtn;
@FindBy(xpath="//input[@placeholder='Enter Project Name' and @class]")
private WebElement projectnametbx;
@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
private WebElement selecttbx;
@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
private WebElement ourcompanytbx;
@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
private WebElement descrptntbx;
@FindBy(xpath="//div[text()='Create Project']")
private WebElement createprojectbtn;
@FindBy(xpath="//div[text()='Hospital'and @class='title']")
private WebElement acutalproname;
public TaskList(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getAdbtnbx() {
	return adbtnbx;
}
//public WebElement getNewcustomtbx() {
//	return newcustomtbx;
//}
//public WebElement getCusomernametbx() {
//	return cusomernametbx;
//}
//public WebElement getDesciptiontbx() {
//	return desciptiontbx;
//}
//public WebElement getSelecttbx() {
//	return selecttbx;
//}
//public WebElement getOurcompanytbx() {
//	return ourcompanytbx;
//}
//public WebElement getCreatecustomertbx() {
//	return createcustomertbx;
//}
//public WebElement getActualcreatcusttbx() {
//	return actualcreatcusttbx;
//}
//public WebElement getHdfcbtn() {
//	return hdfcbtn;
//}
//public WebElement getEdirbtn() {
//	return edirbtn;
//}
//public WebElement getActnbtn() {
//	return actnbtn;
//}
//public WebElement getDeletbtn() {
//	return deletbtn;
//}
//public WebElement getDeltpermntlybtn() {
//	return deltpermntlybtn;
//}
public WebElement getNewprojectbtn() {
	return newprojectbtn;
}
public WebElement getProjectnametbx() {
	return projectnametbx;
}
public WebElement getSelecttbx() {
	return selecttbx;
}
public WebElement getOurcompanytbx() {
	return ourcompanytbx;
}
public WebElement getDescrptntbx() {
	return descrptntbx;
}
public WebElement getCreateprojectbtn() {
	return createprojectbtn;
}
public WebElement getAcutalproname() {
	return acutalproname;
}

}

