package pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;

public class pageFlightsDetails extends PageObject {
	//Variables
	//Elementos
	@FindBy(xpath = "//h2[contains(text(),'Price summary')]")
	WebElement priceSummary;
	@FindBy(xpath = "/html/body/main/div/div[2]/section[1]/div/h2")
	WebElement Tripsummary;
	//Metodos
	public void assertPriceSummary() throws InterruptedException {
		Thread.sleep(5000);
		WebDriver driver = this.getDriver();
		try {
			ArrayList<String> pestaña = new ArrayList<String>(driver.getWindowHandles());
			Thread.sleep(1000);
			driver.switchTo().window(pestaña.get(1));
			Assert.assertEquals(priceSummary.getText(), "Price summary");}
		catch(Exception e) {
			Assert.assertEquals(Tripsummary.getText(), "Trip Summary");
		}
	}
}