package pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageSignIn extends PageObject {
	//Variables
	//Elementos
	@FindBy(xpath = "//header/section[1]/div[1]/nav[1]/div[5]/button[1]")
	WebElement buttonSignIn;
	@FindBy(xpath = "//header/section[1]/div[1]/nav[1]/div[5]/div[1]/div[1]/div[1]/div[1]")
	WebElement buttonSignInConfirmation;
	@FindBy(xpath = "//input[@id='signin-loginid']")
	WebElement email;
	@FindBy(xpath = "//input[@id='signin-password']")
	WebElement Password ;
	@FindBy(xpath = "//button[@id='submitButton']")
	WebElement SignIn;
	@FindBy(xpath = "//body/div[@id='content']/div[1]/div[1]/article[1]/div[2]/form[1]/div[1]/div[1]/h5[1]")
	WebElement textSignInIncorrect;

	//Metodos
	public void getInSignIn() throws InterruptedException  {
		buttonSignIn.click();
		buttonSignInConfirmation.click();
		Thread.sleep(3000);
	}
	public void sendKeysSignIn() throws InterruptedException  {
		email.sendKeys("asd@asd.com");
		Password.sendKeys("asdasd");
		SignIn.click();
	}

	public void assertRecaptcha() throws InterruptedException  {
		Thread.sleep(2000);
		try {
			Assert.assertEquals(textSignInIncorrect, "You may have entered an unknown email address or an incorrect password. Click here to jump to the first invalid field.");
		}catch(Exception e) {
		}
	}
}
