package pageObject;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageHotels extends PageObject {
	//Variables
	//Elementos
	@FindBy(xpath = "//header/section[1]/div[1]/div[1]/nav[1]/div[1]/button[1]")
	WebElement moreTravel;
	@FindBy(xpath = "//header/section[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/a[2]")
	WebElement hotels;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement goinTo;
	@FindBy(xpath = "//input[@id='location-field-destination']")
	WebElement destination;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/button[1]")
	WebElement destinationList;
	@FindBy(xpath = "//button[@id='d1-btn']")
	WebElement checkIn;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]")
	WebElement checkInDatePickerPaging;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[5]/button[1]")
	WebElement checkInDate;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[7]/button[1]")
	WebElement checkOutDate;
	@FindBy(css = "body.uitk-no-outline:nth-child(2) div.app-layer-base--active div.uitk-grid:nth-child(1) div.uitk-cell.Url-Mapping div.uitk-cell div.CentralizedWizardRegion.comet-homepage-module.all-b-margin-three:nth-child(1) div.uitk-grid.SimpleContainer.uitk-flat-border-top.uitk-flat-border-bottom div.uitk-grid.uitk-flex.uitk-flex-justify-content-center div.uitk-cell.all-cell-1-1.all-x-padding-three.s-y-padding-three.m-y-padding-six.l-y-padding-twelve.xl-y-padding-twelve form.WizardHotelPWAv2 div.uitk-layout-grid.uitk-layout-grid-gap-three.uitk-layout-grid-columns-small-2.uitk-layout-grid-columns-large-12.all-t-margin-three:nth-child(2) div.uitk-layout-grid-item.uitk-layout-grid-item-columnspan-small-2.uitk-layout-grid-item-columnspan-large-4:nth-child(2) div.Dates div.uitk-flex.uitk-flex-row.uitk-flex-gap-three.uitk-flex-item.uitk-date-fields.uitk-flex-grow-1:nth-child(3) div.uitk-flex-item.uitk-flex-basis-zero.uitk-flex-grow-1.uitk-date-field-wrapper:nth-child(1) div.uitk-date-picker-menu.uitk-menu.uitk-menu-mounted div.uitk-date-picker-menu-container.uitk-date-picker-menu-container-double.uitk-menu-container.uitk-menu-open.uitk-menu-pos-left.uitk-menu-container-autoposition.uitk-menu-container-text-nowrap div.uitk-date-picker.date-picker-menu div.uitk-flex.uitk-date-picker-menu-footer:nth-child(3) button.uitk-button.uitk-button-small.uitk-button-has-text.uitk-button-primary.uitk-flex-align-self-flex-end.uitk-flex-item.uitk-flex-shrink-0.dialog-done > span:nth-child(1)")
	WebElement checkInDone;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/button[1]")
	WebElement travelers;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[1]/button[2]")
	WebElement adultsmore;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]")
	WebElement travelersDone;
	@FindBy(xpath = "//button[contains(text(),'Search')]")
	WebElement search;

	//Metodos
	public void chooseHotelsdestination() throws InterruptedException  {
		moreTravel.click();
		hotels.click();
		goinTo.click();
		destination.sendKeys("miami");
		Thread.sleep(2000);
		destinationList.click();
		Thread.sleep(2000);
	}

	public void chooseHotelsDate() throws InterruptedException  {
		checkIn.click();
		checkInDatePickerPaging.click();
		checkInDate.click();
		checkOutDate.click();
		Thread.sleep(2000);
		checkInDone.click();
		Thread.sleep(2000);
	}
	public void chooseHotelTravelers() throws InterruptedException  {
		travelers.click();
		adultsmore.click();
		travelersDone.click();
		search.click();
	}
}