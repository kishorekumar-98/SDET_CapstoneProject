package CaseStudy3_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage {

    private WebDriver driver;
    
    public SearchResultsPage(WebDriver driver)
    {
        this.driver = driver;
    }


    @FindBy(css = "div._4rR01T")
    private List<WebElement> searchItems;

   
    public int getNumberOfDisplayedItems() 
    {
        return searchItems.size();
    }

    public void clickOnFirstItem()
    {
        searchItems.get(0).click();
    }
}