package access.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://oursite.com/reg")
public class RegistrationPage extends PageObject {

	@FindBy(name="email")
    private WebElementFacade email;
	
	@FindBy(name="firstname")
    private WebElementFacade firstname;
	
	@FindBy(name="lastname")
    private WebElementFacade lastname;
	
	@FindBy(name="memberid")
    private WebElementFacade memberid;
	
	@FindBy(name="password")
    private WebElementFacade password;
	
	@FindBy(name="repeatpass")
    private WebElementFacade rpassword;
	
	@FindBy(xpath="//button[.='browse now']")
    private WebElementFacade browsenowBtn;
		
	@FindBy(name="Accept_Terms_of_Use")
    private WebElementFacade termsofuseChb;
	
    
	public void enter_email(String keyword) {
		email.clear();
		email.sendKeys(keyword);
        
    }
	
	public void enter_firstname(String keyword) {
    	firstname.clear();
    	firstname.sendKeys(keyword);
        
    }
    
    public void enter_memberid(String keyword) {
    	memberid.clear();
    	memberid.sendKeys(keyword);
        
    }
    
    public void enter_lastname(String keyword) {
    	lastname.clear();
    	lastname.sendKeys(keyword);
        
    }
    
    public void enter_password(String keyword) {
    	password.clear();
    	password.sendKeys(keyword);
        
    }
    
    public void enter_rpassword(String keyword) {
    	rpassword.clear();
    	rpassword.sendKeys(keyword);
        
    }
    
    public void accept_term_of_use() {
    	this.setCheckbox(termsofuseChb, true);
        
    }
    
    public void browsenow () {
    	browsenowBtn.click();
    }
    

}
