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
public class SignInTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public EndUserSteps user;
    
    @Before
	public void maxwin() {
		webdriver.manage().window().maximize();		
	}
    
    @Test
    @Title("TC 001. Sign in with correct credentials (email)")
    public void sign_in_with_correct_credentials_email () {
        user.open_signin_page();
        user.type_email_for_signin("actual@email.com");
        user.type_password_for_signin("1qaz2wsx");
        user.signin();
    }

} 