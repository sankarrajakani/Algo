package stepdefinitions;
    import io.cucumber.java.en.*;
    import workflows.SeleniumWorkFlow;
    import org.junit.Assert;
    import common.Assertion;
    import common.WebBrowserUtil;
    public class LoginStepDefinition
	{
        SeleniumWorkFlow workFlow = new SeleniumWorkFlow();
        

            @When("^I entered Work Email in login as '(.*)'$")			
            public void WhenIEnteredWorkEmailInLoginAsworkEmail(String  workEmail)
            {
                workFlow.enterText(workEmail,0,"Login","Login.WorkEmailTextBoxXPATH","XPATH");
                
            }

            @When("^I entered Password in login as '(.*)'$")			
            public void WhenIEnteredPasswordInLoginAspassword(String  password)
            {
                workFlow.enterText(password,0,"Login","Login.PasswordTextBoxXPATH","XPATH");
                
            }

            @When("^I selected Log In in login$")			
            public void WhenISelectedLogInInLogin()
            {
                workFlow.clickedElement(0,"Login","Login.LogInButtonXPATH","XPATH");
                
            }

             @Then("^'(.*)' is displayed with '(.*)'$")			
            public void ThenpageIsDisplayedWithcontent(String  page, String content)
            {
                Assertion.IsTrue(workFlow.VerifyDefaultpageIsdisplayed(page), "Then '<page>' is displayed with '<content>'");
                Assertion.IsTrue(workFlow.VerifymessageIsDisplayed(content), "");;
                Assertion.assertAll();
            }
    }