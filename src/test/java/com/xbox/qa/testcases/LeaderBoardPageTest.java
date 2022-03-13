package com.xbox.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xbox.qa.base.TestBase;
import com.xbox.qa.pages.HomePage;
import com.xbox.qa.pages.LeaderBoardPage;

public class LeaderBoardPageTest extends TestBase {
	HomePage homePage;
	LeaderBoardPage leaderboardPage;

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialalization();
		homePage = new HomePage();
		leaderboardPage = new LeaderBoardPage();
	}

	@Test
	public void ValidateGameTagsTest() {
		leaderboardPage.ValidateGameTags();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
