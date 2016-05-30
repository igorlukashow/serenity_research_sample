package access.uitests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import access.steps.serenity.EndUserSteps;

@RunWith(SerenityRunner.class)
public class RegistrationTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps user;
    
    @Before
	public void maxwin() {
		webdriver.manage().window().maximize();		
	}
    
    @Test
    @Title("TC 002. Successful short registration for new user with payment type Credit card."
    		+ "Press “browse now” button and go to sign in page.")
    public void edit_lastname() {
        user.open_registration_page();
        user.type_email("notregistered@oursite.com");
        user.type_firstname("Ivan");
        user.type_lastname("Ivanov");
        user.type_memberid("Ivan123");
        user.type_password("1qaz2wsx");
        user.type_rpassword("1qaz2wsx");
        user.accept_term_of_use();
        user.browseNow();
    }
    

} 