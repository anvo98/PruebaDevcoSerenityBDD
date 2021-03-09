package pageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;



public class pageFlights extends PageObject {
	//Variables
	//Elementos
	@FindBy(xpath = "//header/section[1]/div[1]/div[1]/nav[1]/div[1]/button[1]")
	WebElement moreTravel;
	@FindBy(xpath = "//header/section[1]/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/a[4]")
	WebElement flights;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/ul[1]/div[1]/li[1]/a[1]")
	WebElement roundTrip;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/ul[1]/div[1]/li[2]/a[1]")
	WebElement oneWay;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/ul[1]/div[1]/li[3]/a[1]")
	WebElement multiCity;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement leavingFrom;
	@FindBy(xpath = "//input[@id='location-field-leg1-origin']")
	WebElement leavingFromInput;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/button[1]")
	WebElement leavingFromList;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement goingTo;
	@FindBy(xpath = "//input[@id='location-field-leg1-destination']")
	WebElement goingToInput;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/button[1]")
	WebElement goingToList;
	@FindBy(xpath = "//button[@id='d1-btn']")
	WebElement departing;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/button[2]")
	WebElement departingDatePickerPaging;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[5]/button[1]")
	WebElement departingDate;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[5]/button[1]")
	WebElement returningDate;
	@FindBy(css = "div.app-layer-base--active div.uitk-grid:nth-child(1) div.uitk-cell.Url-Mapping div.uitk-cell div.CentralizedWizardRegion.comet-homepage-module.all-b-margin-three:nth-child(1) div.uitk-grid.SimpleContainer.uitk-flat-border-top.uitk-flat-border-bottom div.uitk-grid.uitk-flex.uitk-flex-justify-content-center div.uitk-cell.all-cell-1-1.all-x-padding-three.s-y-padding-three.m-y-padding-six.l-y-padding-twelve.xl-y-padding-twelve form.WizardFlightPWA div.uitk-tabs-container:nth-child(4) div.uitk-tabs-content div.uitk-tabs-pane.active:nth-child(1) div.uitk-layout-grid.uitk-layout-grid-gap-three.uitk-layout-grid-columns-small-4.uitk-layout-grid-columns-medium-6.uitk-layout-grid-columns-large-12.uitk-spacing.uitk-spacing-padding-block-three:nth-child(2) div.uitk-layout-grid-item.uitk-layout-grid-item-columnspan-small-4.uitk-layout-grid-item-columnspan-medium-6.uitk-layout-grid-item-columnspan-large-4:nth-child(2) div.Dates div.uitk-flex.uitk-flex-row.uitk-flex-gap-three.uitk-flex-item.uitk-date-fields.uitk-flex-grow-1:nth-child(3) div.uitk-flex-item.uitk-flex-basis-zero.uitk-flex-grow-1.uitk-date-field-wrapper:nth-child(1) div.uitk-date-picker-menu.uitk-menu.uitk-menu-mounted div.uitk-date-picker-menu-container.uitk-date-picker-menu-container-double.uitk-menu-container.uitk-menu-open.uitk-menu-pos-left.uitk-menu-container-autoposition.uitk-menu-container-text-nowrap div.uitk-date-picker.date-picker-menu div.uitk-flex.uitk-date-picker-menu-footer:nth-child(3) > button.uitk-button.uitk-button-small.uitk-button-has-text.uitk-button-primary.uitk-flex-align-self-flex-end.uitk-flex-item.uitk-flex-shrink-0.dialog-done")
	WebElement dateDone;
	@FindBy(xpath = "//button[contains(text(),'Search')]")
	WebElement search;
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[2]/div[3]/div[1]/section[1]/main[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement selectFlight;

	//Metodos
	public void chooseFlightsRoundtrip()  {
		moreTravel.click();
		flights.click();
		roundTrip.click();
	}

	public void chooseFlightsRoundtripCities(String ciudadOrigen, String ciudadDestino) throws InterruptedException {
		leavingFrom.click();
		leavingFromInput.sendKeys(ciudadOrigen);
		Thread.sleep(2000);
		leavingFromList.click();
		goingTo.click();
		goingToInput.sendKeys(ciudadDestino);
		Thread.sleep(2000);
		goingToList.click();
	}

	public void chooseFlightsRoundtripDates() throws InterruptedException {
		departing.click();
		departingDatePickerPaging.click();
		departingDate.click();
		returningDate.click();
		Thread.sleep(2000);
		dateDone.click();
	}

	public void chooseFlightsRoundtripsearch() throws InterruptedException {
		Thread.sleep(2000);
		search.click();
		Thread.sleep(8000);
	}
}