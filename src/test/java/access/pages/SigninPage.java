package access.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import net.thucydides.core.pages.PageObject;


@DefaultUrl("https://oursite.com/signin")
public class SigninPage extends PageObject {

    @FindBy(name="email")
    private WebElementFacade email;

    @FindBy(name="password")
    private WebElementFacade password;
    
    @FindBy(name="memberid")
    private WebElementFacade memberid;
    
    @FindBy(xpath="//button")
    private WebElementFacade signinBtn;

    
    public void enter_email(String keyword) {
        email.type(keyword);
    }

    public void enter_password(String keyword) {
        password.type(keyword);
    }
    
    public void enter_memberid(String keyword) {
        memberid.type(keyword);
    }
    
    public void signin() {
        signinBtn.click();
    }

}