package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUP(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        WebElement registerText = driver.findElement(By.xpath("//div[@class='page-title']/h1"));
        Assert.assertEquals(registerText.getText(), "Register");
    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();
        WebElement genderRadio = driver.findElement(By.id("gender-male"));
        genderRadio.click();
        WebElement firstNameField = driver.findElement(By.id("FirstName"));
        firstNameField.sendKeys("Neha");
        WebElement lastNameField = driver.findElement(By.id("LastName"));
        lastNameField.sendKeys("Chauhan");
        WebElement dayDropDown = driver.findElement(By.name("DateOfBirthDay"));
        dayDropDown.sendKeys("30");
        WebElement monthDropDown = driver.findElement(By.name("DateOfBirthMonth"));
        monthDropDown.sendKeys("October");
        WebElement yearDropDown = driver.findElement(By.name("DateOfBirthYear"));
        yearDropDown.sendKeys("1983");
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Ssp@gmail.com");
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("ssChauhan123");
        WebElement confirmPasswordField = driver.findElement(By.id("ConfirmPassword"));
        confirmPasswordField.sendKeys("ssChauhan123");
        WebElement registerButton = driver.findElement(By.id("register-button"));
        registerButton.click();
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='result']"));
        Assert.assertEquals(successMessage.getText(), "Your registration completed");
    }
    @After
    public void tearDown(){
        driver.close();
    }


}


