package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


    public class LoginTest extends BaseTest {
        String baseUrl = "https://demo.nopcommerce.com/";

        @Before
        public void setUP() {
            openBrowser(baseUrl);
        }

        @Test
        public void userShouldNavigateToLoginPageSuccessfully() {
            //Find login link and click on login link
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();
            String expectedMessage = "Welcome, Please Sign In!";
            WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(), 'Welcome, Please Sign In!')]"));

        }

        @Test
        public void userShouldLoginSuccessfullyWithValidCredentials() {

            //Click on the login link
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();
            //Find the Email Field Element
            WebElement emailField = driver.findElement(By.id("Email"));
            // Type the Email address to email field element
            emailField.sendKeys("prime13@gmail.com");
            //Find the Password Field Element and send password on password field
            driver.findElement(By.name("Password")).sendKeys("Prim123");

            //Find the Login btn Element and click
            WebElement loginBtn = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
            loginBtn.click();

        }

        @Test
        public void verifyErrorMessage() {
            // Find login link and click on login link
            WebElement loginLink = driver.findElement(By.linkText("Log in"));
            loginLink.click();
            //Find the Email field element

            WebElement emailField = driver.findElement(By.id("Email"));
            //Type the email address to email field
            emailField.sendKeys("Prime123@gmail.com");
            //Find the password field

            WebElement passwordField = driver.findElement(By.id("Password"));
            //Type the password in password field
            passwordField.sendKeys("Prime123");
            //Find the password button element and click

            WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
            loginButton.click();
            String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";
            WebElement actualTextElement = driver.findElement(By.xpath("//div[contains(text(),'Login was unsuccessful.')]"));
            ////div[@class='message-error validation-summary-errors']
            String actualMessage = actualTextElement.getText();
            Assert.assertEquals("Error message not displayed", expectedMessage, actualMessage);


        }

        @After
        public void teardown() {
            closeBrowser();

        }
    }






