package CaseStudy3_1;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ContactpageTest extends BaseClass{

    private ContactPage contactPage;

    @BeforeClass
    public void setUp() {
        super.setUp();
        contactPage = new ContactPage(driver);
    }

    @Test
    public void testFormSubmission() {
        driver.get("https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/");
        Assert.assertEquals(driver.getTitle(), "Want to practice test automation? Try these demo sites! | Automation Panda");

        contactPage.openContactPage();
        Assert.assertEquals(driver.getTitle(), "Contact | Automation Panda");

        String name = "Kishorekumar";
        String email = "onetempact@gmail.com";
        String comment = "Test";

        contactPage.fillContactForm(name, email, comment);

        String confirmationMessage = contactPage.getMessageSentText();
        Assert.assertEquals(confirmationMessage, "Your message has been sent");
    }

}
