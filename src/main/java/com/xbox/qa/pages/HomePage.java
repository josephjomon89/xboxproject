package com.xbox.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xbox.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath= "//a[contains(text(),'Leaderboards')]")
	WebElement LeaderBoardLink;
	
	@FindBy(xpath="//a[@class='navbar-brand text-weight-bold text-white']")
	WebElement Logo;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	public boolean verifyLogoPage() {
		return Logo.isDisplayed();
		
		
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
		
		
	}
	
		public LeaderBoardPage clickonLeaerBoardLink()throws InterruptedException  {
			LeaderBoardLink.click();
			return new LeaderBoardPage();
			
			
	}
	public void validateGames() {
		driver.findElement(By.xpath("//input[@class='form-control mr-sm-2']")).sendKeys("Duskamo" + Keys.ENTER);
		
		String a = driver.findElement(By.xpath("//a[contains(text(),'League of Legends')]")).getText();
		String b =driver.findElement(By.xpath("//a[contains(text(),'Fortnite')]")).getText();
		String c =driver.findElement(By.xpath("//a[contains(text(),'DARK SOULS™ II ')]")).getText();
		String d =driver.findElement(By.xpath("//a[contains(text(),'Skyrim')]")).getText();
		String e =driver.findElement(By.xpath("//a[contains(text(),'League of Legends')]")).getText();
		
		System.out.println("\n" +a+ "\n" +b+ "\n" +c+ "\n" +d+ "\n" +e+ "");
		
}
}