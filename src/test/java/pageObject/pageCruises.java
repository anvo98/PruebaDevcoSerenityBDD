package pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class pageCruises extends PageObject {
	//Variables
	//Elementos
	@FindBy(xpath = "//header/section[1]/div[1]/div[1]/nav[1]/div[1]/button[1]")
	WebElement moreTravel;
	@FindBy(xpath = "//header/section[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/a[5]")
	WebElement Cruises;
	@FindBy(xpath = "//select[@id='cruise-destination']")
	WebElement goinTo;
	@FindBy(xpath = "//button[contains(text(),'Search')]")
	WebElement search;
	@FindBy(xpath = "//body/div[@id='bodyContent']/div[@id='main-content']/div[@id='paxModalContainer']/div[1]/div[1]/div[2]/div[1]/button[1]")
	WebElement go;
	@FindBy(xpath = "//a[@id='selectSailingButton-AQoCY3YSAmJyGID49fqlLyAEKgNnbHMyAnVzOgNnbHNCAnVz-BR']")
	WebElement CruisesItem;
	@FindBy(xpath = "//a[@id='supercat-INSIDE']")
	WebElement CruisesItemCabin;
	@FindBy(xpath = "//body/div[@id='bodyContent']/div[@id='main-content']/div[@id='ember269']/div[@id='cabin-category-north-view']/section[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/a[1]")
	WebElement CruisesItemCabinType;
	@FindBy(xpath = "//body/div[@id='bodyContent']/div[@id='main-content']/div[@id='ember269']/div[@id='cabin-category-north-view']/aside[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]")
	WebElement PriceDetails;

	//Metodos
	public void chooseCruisesGoinTo() throws InterruptedException {
		moreTravel.click();
		Cruises.click();
		Thread.sleep(5000);
		WebDriver driver = this.getDriver();
		Select goinToo = new Select(goinTo);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		goinToo.selectByVisibleText("Caribbean");
		Thread.sleep(2000);
		search.click();
	}

	public void chooseCruise() throws InterruptedException {
		Thread.sleep(3000);
		try {
			go.click();
		}catch(Exception e) {}
		Thread.sleep(2000);
		CruisesItem.click();
		Thread.sleep(4000);
		WebDriver driver = this.getDriver();
		ArrayList<String> pestaña = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(pestaña.get(1));
		Thread.sleep(2000);
		CruisesItemCabin.click();
		Thread.sleep(1000);
		CruisesItemCabinType.click();
	}

	public void assertSearchCruises() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertEquals(PriceDetails.getText(), "Price details");
	}
}