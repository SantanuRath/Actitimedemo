package com.actitimeproject.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack {
@FindBy(id="logoutLink")
private WebElement lgoutbt;
@FindBy(xpath="//div[text()='Tasks']")
private WebElement tskbtn;
public EnterTimeTrack(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void setLogout() {
	lgoutbt.click();
}
public void setTask() {
	tskbtn.click();
}
}
