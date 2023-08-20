package CaseStudy3_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
	
	 private WebDriver driver;
	   
	 public ContactPage(WebDriver driver) {
	        this.driver = driver;
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    }

	    public void openContactPage() {
	    	  driver.findElement(By.xpath("//a[text()='Contact']")).click();
	    }

	    public void fillContactForm(String name, String email, String comment) {
	    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	driver.findElement(By.id("g3-name")).sendKeys(name);
	    	driver.findElement(By.id("g3-email")).sendKeys(email);
	    	driver.findElement(By.id("contact-form-comment-g3-message")).sendKeys(comment);
	        driver.findElement(By.xpath("//button[@class=\"wp-block-button__link has-text-color has-black-color\"]")).click();
	    }

	    public String getMessageSentText() {
	        return driver.findElement(By.id("contact-form-success-header")).getText();
	    }

}
