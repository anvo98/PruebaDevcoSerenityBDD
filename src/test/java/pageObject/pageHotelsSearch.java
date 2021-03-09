package pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;


public class pageHotelsSearch extends PageObject {
	//Variables
	//Elementos
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[2]/section[2]/ol[1]/li[1]/div[1]/div[1]/a[1]")
	WebElement ChooseHotelitem;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
	WebElement reserveRoom;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/section[1]/form[1]/fieldset[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
	WebElement searchByPropertyName;
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/section[1]/form[1]/fieldset[1]/div[1]/div[2]/div[1]/div[1]/div[2]/header[1]/section[1]/div[1]/input[1]")
	WebElement searchByPropertyNameInput;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/section[1]/form[1]/fieldset[1]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/button[1]")
	WebElement searchByPropertyNameList;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[5]/div[1]/div[1]/section[1]/ul[1]/li[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/button[1]")
	WebElement reserveRoomItem;
	@FindBy(css = "body.uitk-no-outline:nth-child(2) div.app-layer-base--active div.page-container.infosite div.xl-x-margin-six.l-x-margin-six.m-x-margin-six div.uitk-flex.main-region div.uitk-flex-item.main-body.m-t-margin-two.l-t-margin-three.xl-t-margin-three:nth-child(1) main.main-region.infosite__main div.infosite__content.infosite__content--details div.rooms-and-rates.s-t-margin-three.m-t-margin-three.s-x-padding-three.m-x-padding-zero.l-x-padding-zero.xl-x-padding-zero:nth-child(2) section.uitk-spacing.uitk-spacing-margin-blockstart-six div.uitk-layout-grid.uitk-layout-grid-gap-three.uitk-layout-grid-columns-auto_fit-seventy_six.uitk-layout-grid-justify-content-start.uitk-spacing.uitk-spacing-margin-blockend-three div.uitk-flex.uitk-flex-column.uitk-flex-justify-content-space-between.uitk-card-aloha.uitk-card-aloha-roundcorner-all.uitk-card-aloha-has-border.uitk-card-aloha-has-overflow.all-b-margin-three:nth-child(1) div.uitk-card-aloha-content-section.uitk-card-aloha-content-section-padded.uitk-flex-item div:nth-child(1) div.uitk-flex.uitk-flex-align-items-flex-end.uitk-flex-justify-content-space-between div.uitk-flex.uitk-flex-align-items-flex-end.uitk-flex-column.uitk-flex-item > button.uitk-button.uitk-button-small.uitk-button-primary")
	WebElement reserveRoomItem2;
	@FindBy(xpath = "//button[contains(text(),'Pay now')]")
	WebElement payNow;
	@FindBy(xpath = "//div[contains(text(),'Price details')]")
	WebElement priceDetails;
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[2]/div/figure/header/button/svg")
	WebElement modalHotels;
	//Metodos

	public void searchHotel() throws InterruptedException  {
		Thread.sleep(5000);
		searchByPropertyName.click();
		searchByPropertyNameInput.sendKeys("Suites at Congress Ocean Drive");
		Thread.sleep(2000);
		searchByPropertyNameList.click();
		Thread.sleep(2000);
		try {
			modalHotels.click();}
		catch(Exception e) {}
	}
	public void chooseHotel() throws InterruptedException  {
		ChooseHotelitem.click();
		Thread.sleep(2000);
		WebDriver driver = this.getDriver();
		ArrayList<String> pestaña = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(pestaña.get(1));
		Thread.sleep(2000);
		reserveRoom.click();
		Thread.sleep(1000);
		reserveRoomItem.click();
	}

	public void assertPriceHotel() throws InterruptedException  {
		Thread.sleep(2000);
		Assert.assertEquals(priceDetails.getText(),"Price details");
	}
}
