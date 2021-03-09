package pageObject;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class pageCars extends PageObject {
	//Variables
	//Elementos
	@FindBy(xpath = "//header/section[1]/div[1]/div[1]/nav[1]/div[1]/button[1]")
	WebElement moreTravel;
	@FindBy(xpath = "//header/section[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/a[3]")
	WebElement caars;
	@FindBy(xpath = "//*[@id=\"location-field-locn-menu\"]/div[1]/button")
	WebElement pickUp;
	@FindBy(xpath = "//input[@id='location-field-locn']")
	WebElement pickUpInput;
	@FindBy(xpath = "//*[@id=\"location-field-locn-menu\"]/div[2]/ul/li[1]/button")
	WebElement pickUpList;
	@FindBy(xpath = "//*[@id=\"location-field-loc2-menu\"]/div[1]/button")
	WebElement dropOff;
	@FindBy(xpath = "//input[@id='location-field-loc2']")
	WebElement dropOffInput;
	@FindBy(xpath = "//*[@id=\"location-field-loc2-menu\"]/div[2]/ul/li[1]/button")
	WebElement dropOffList;
	@FindBy(xpath = "//*[@id=\"d1-btn\"]")
	WebElement pickUpDate;
	@FindBy(xpath = "//*[@id=\"Rental-cars-transportation\"]/div[2]/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div[1]/button[2]")
	WebElement pickUpDatePickerPaging;
	@FindBy(xpath = "//*[@id=\"Rental-cars-transportation\"]/div[2]/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[1]/button")
	WebElement pickUpDateIn;
	@FindBy(xpath = "//*[@id=\"Rental-cars-transportation\"]/div[2]/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[7]/button")
	WebElement dropOffDateOut;
	@FindBy(css = "div.app-layer-base--active div.uitk-grid:nth-child(1) div.uitk-cell.Url-Mapping div.uitk-cell div.CentralizedWizardRegion.comet-homepage-module.all-b-margin-three:nth-child(1) div.uitk-grid.SimpleContainer.uitk-flat-border-top.uitk-flat-border-bottom div.uitk-grid.uitk-flex.uitk-flex-justify-content-center div.uitk-cell.all-cell-1-1.all-x-padding-three.s-y-padding-three.m-y-padding-six.l-y-padding-twelve.xl-y-padding-twelve form.WizardCarPWA div.uitk-tabs-container div.uitk-tabs-content div.uitk-tabs-pane.active:nth-child(1) div.uitk-layout-grid.uitk-layout-grid-gap-three.uitk-layout-grid-columns-small-2.uitk-layout-grid-columns-medium-12.uitk-spacing.uitk-spacing-margin-blockstart-three:nth-child(2) div.uitk-layout-grid-item.uitk-layout-grid-item-columnspan-small-2.uitk-layout-grid-item-columnspan-medium-12.uitk-layout-grid-item-columnspan-large-6:nth-child(1) div.Dates div.uitk-flex.uitk-flex-row.uitk-flex-gap-three.uitk-flex-item.uitk-date-fields.uitk-flex-grow-1:nth-child(3) div.uitk-flex-item.uitk-flex-basis-zero.uitk-flex-grow-1.uitk-date-field-wrapper:nth-child(1) div.uitk-date-picker-menu.uitk-menu.uitk-menu-mounted div.uitk-date-picker-menu-container.uitk-date-picker-menu-container-double.uitk-menu-container.uitk-menu-open.uitk-menu-pos-left.uitk-menu-container-autoposition.uitk-menu-container-text-nowrap div.uitk-date-picker.date-picker-menu div.uitk-flex.uitk-date-picker-menu-footer:nth-child(3) button.uitk-button.uitk-button-small.uitk-button-has-text.uitk-button-primary.uitk-flex-align-self-flex-end.uitk-flex-item.uitk-flex-shrink-0.dialog-done > span:nth-child(1)")
	WebElement pickUpDone;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/select[1]")
	WebElement pickUpTime;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/select[1]")
	WebElement dropOffTime;
	@FindBy(xpath = "//button[contains(text(),'Search')]")
	WebElement search;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[3]/div[2]/a[1]/button[1]")
	WebElement reserveCarItem;
	@FindBy(xpath = "//button[contains(text(),'Reserve')]")
	WebElement reserve;
	@FindBy(xpath = "//*[@id='preferences']/section/header/h2")
	WebElement whosDriving;

	//Metodos
	public void searchCarRentalsCities(String ciudadOrigen,String	ciudadDestino) throws InterruptedException  {
		moreTravel.click();
		caars.click();
		Thread.sleep(3000);
		pickUp.click();
		pickUpInput.sendKeys(ciudadOrigen);
		Thread.sleep(2000);
		pickUpList.click();
		dropOff.click();
		dropOffInput.sendKeys(ciudadDestino);
		Thread.sleep(2000);
		dropOffList.click();
		Thread.sleep(2000);
	}

	public void searchCarRentalsDate() throws InterruptedException  {
		pickUpDate.click();
		pickUpDatePickerPaging.click();
		pickUpDateIn.click();
		dropOffDateOut.click();
		Thread.sleep(2000);
		pickUpDone.click();
		Thread.sleep(2000);
	}

	public void searchCarRentalsTime(String horaRecogida,String horaEntrega) throws InterruptedException  {
		WebDriver driver = this.getDriver();
		Select pickUptimes = new Select(pickUpTime);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		pickUptimes.selectByVisibleText(horaRecogida);
		Select dropOffTimes = new Select(dropOffTime);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		pickUptimes.selectByVisibleText(horaEntrega);
		search.click();
	}

	public void searchCarRentalsitems() throws InterruptedException  {
		Thread.sleep(8000);
		reserveCarItem.click();
		Thread.sleep(3000);
		WebDriver driver = this.getDriver();
		ArrayList<String> pestaña = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1000);
		driver.switchTo().window(pestaña.get(1));
		reserve.click();
	}
	public void assertSearchCarRentals() throws InterruptedException  {
		Thread.sleep(2000);
		Assert.assertEquals(whosDriving.getText(), "Who's driving?");
	}
}