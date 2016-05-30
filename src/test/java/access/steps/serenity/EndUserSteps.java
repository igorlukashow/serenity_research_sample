package access.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import access.pages.RegistrationPage;
import access.pages.SigninPage;

public class EndUserSteps extends ScenarioSteps {

	String SIGN_IN_PAGE_HEADER = "Oursite.com: Sign in";
	
	SigninPage signinPage;
    RegistrationPage registrationPage;

    @Step
    public void type_email_for_signin(String keyword) {
        signinPage.enter_email(keyword);
    }

    @Step
    public void type_password_for_signin(String keyword) {
        signinPage.enter_password(keyword);
    }
    
    @Step
    public void type_memberid_for_signin(String keyword) {
        signinPage.enter_memberid(keyword);
    }
    
    @Step
    public void signin() {
        signinPage.signin();
    }

    @Step
    public void open_signin_page() {
        signinPage.open();
    }
    
    @Step
    public void open_registration_page() {
        registrationPage.open();
    }
    
    @Step
    public void type_email(String keyword){
    	registrationPage.enter_email(keyword);
    }
    
    @Step
    public void type_password(String keyword){
    	registrationPage.enter_password(keyword);
    }
    
    @Step
    public void type_rpassword(String keyword){
    	registrationPage.enter_rpassword(keyword);
    }
    
    @Step
    public void type_lastname(String keyword){
    	registrationPage.enter_lastname(keyword);
    }
    
    @Step
    public void type_firstname(String keyword){
    	registrationPage.enter_firstname(keyword);
    }
    
    @Step
    public void type_memberid(String keyword){
    	registrationPage.enter_memberid(keyword);
    }
    
    @Step
    public void accept_term_of_use(){
    	registrationPage.accept_term_of_use();
    }
    
    @Step
    public void browseNow (){
    	registrationPage.browsenow();
    	signinPage.waitForAnyTextToAppear("Sign in");
    	assertThat(signinPage.getTitle()).isEqualTo(SIGN_IN_PAGE_HEADER);
    }
    
 }

    