package com.xbox.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xbox.qa.base.TestBase;

public class LeaderBoardPage extends TestBase {

	

	@FindBy(xpath= "//a[contains(text(),'Leaderboards')]")
	WebElement LeaderBoardLink;
	
	public LeaderBoardPage() {
		PageFactory.initElements(driver, this);
	}

	public void ValidateGameTags() {
		LeaderBoardLink.click();
		String before_xpath = "//a[@class='display-4 stretched-link']/preceding-sibling::div[contains(text(),'";
		String after_xpath = "')]/parent::div[1]";

		for (int i = 1; i <= 5; i++) {
			String j = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(" " + j);
		}
	}
}
