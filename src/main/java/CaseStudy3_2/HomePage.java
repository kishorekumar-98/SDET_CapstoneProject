package CaseStudy3_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    private WebDriver driver;
    
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(xpath ="//img[@title='Flipkart']")
    private WebElement flipkartLogo;

    @FindBy(name = "q")
    private WebElement searchBox;

  

    public boolean isFlipkartLogoPresent() 
    {
        return flipkartLogo.isDisplayed();
    }

    public void searchForItem(String item)
    {
        searchBox.sendKeys(item);
        searchBox.submit();
    }
}
