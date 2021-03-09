package pageObject;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageFlightsSearch extends PageObject {
	//Variables
	//Elementos
	@FindBy(xpath = "/html/body/div[2]/div[1]/div/div[2]/div[3]/div/section/main/ul/li[1]/div/div/div/button")
	WebElement selectFlight;
	@FindBy(xpath = "/html/body/div[2]/div[11]/section/div/div[13]/ul/li[1]/div[1]/div[1]/div[2]/div/div[2]/button")
	WebElement selectFlight2in;
	@FindBy(xpath = "/html/body/div[2]/div[11]/section/div/div[13]/ul/li[1]/div[1]/div[1]/div[2]/div/div[2]/button")
	WebElement selectFlight2out;
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	WebElement selectFlightContinue;
	@FindBy(xpath = "//a[contains(text(),'No Thanks')]")
	WebElement selectFlightModalNoThanks;
	@FindBy(css = "#forcedChoiceNoThanks")
	WebElement selectFlightModalNoThanks2;
	@FindBy(xpath = "/html/body/main/div/div[2]/section[1]/div/h2")
	WebElement Tripsummary;
	@FindBy(xpath = "//html/body/div[2]/div[11]/section/div/div[13]/ul/li[1]/div[2]/div/div/div/div[1]/button")
	WebElement selectThisFare;

	//Metodos
	public void selectFlight()  throws InterruptedException{
		WebDriver driver = this.getDriver();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		try {
			selectFlight.click();
			Thread.sleep(1000);
			selectFlightContinue.click();
			Thread.sleep(4000);
			try {
				selectFlightModalNoThanks.click();}
			catch(Exception e) {}
			jse.executeScript("window.scrollBy(0,250)");
			selectFlight.click();
			selectFlightContinue.click();
			try {
				selectFlightModalNoThanks.click();}
			catch(Exception e) {}
			Thread.sleep(5000);
		}
		catch(Exception e) {
			selectFlight2in.click();
			Thread.sleep(1000);
			selectThisFare.click();
			jse.executeScript("window.scrollBy(0,250)");
			Thread.sleep(2000);
			selectFlight2out.click();
			Thread.sleep(1000);
			selectThisFare.click();
			Thread.sleep(2000);
			try {
				selectFlightModalNoThanks2.click();}
			catch(Exception f) {}
			Thread.sleep(5000);
		}
	}
}
