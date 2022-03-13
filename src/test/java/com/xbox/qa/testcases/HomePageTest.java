package com.xbox.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xbox.qa.base.TestBase;
import com.xbox.qa.pages.HomePage;
import com.xbox.qa.pages.LeaderBoardPage;

public class HomePageTest extends TestBase {

	HomePage homePage;
	LeaderBoardPage leaderboardPage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialalization();
		homePage = new HomePage();
	}

	@Test
	public void verifyHomePageTest() throws InterruptedException {
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Xbox Gamertag");
	}

	@Test
	public void selectLeaderBoardPage() throws InterruptedException {
		homePage.clickonLeaerBoardLink();

	}
	
	@Test
	public void validateGamesTitleTest() {
		homePage.validateGames();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
