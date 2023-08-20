package CaseStudy3_2;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class FlipkartTest extends BaseClass {

    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);
    }

    @Test
    public void testFlipkartSearchAndNavigation() {
        driver.get("https://www.flipkart.com/");

        Assert.assertTrue(homePage.isFlipkartLogoPresent(), "Flipkart is not present");

        homePage.searchForItem("iphone 14");

        int numberOfItemsDisplayed = searchResultsPage.getNumberOfDisplayedItems();
        Assert.assertTrue(numberOfItemsDisplayed > 0, "No items displayed in search results");

        searchResultsPage.clickOnFirstItem();

        String expectedTitle = "APPLE iPhone 14 ( 128 GB Storage ) Online at Best Price On Flipkart.com";
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }
}