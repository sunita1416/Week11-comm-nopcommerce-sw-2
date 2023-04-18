package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        // Click on the Computers tab
        WebElement computersTab = driver.findElement(By.linkText("Computers"));
        computersTab.click();
        // Verify the text "Computers"
        WebElement computersPageTitle = driver.findElement(By.xpath("//h1[text()='Computers']"));
        Assert.assertEquals(computersPageTitle.getText(), "Computers");

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // Click on the Electronics tab
        WebElement electronicsTab = driver.findElement(By.linkText("Electronics"));
        electronicsTab.click();

        // Verify the text "Electronics"
        WebElement electronicsPageTitle = driver.findElement(By.xpath("//h1[text()='Electronics']"));
        Assert.assertEquals(electronicsPageTitle.getText(), "Electronics");
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        // Click on the Apparel tab
        WebElement apparelTab = driver.findElement(By.linkText("Apparel"));
        apparelTab.click();

        // Verify the text "Apparel"
        WebElement apparelPageTitle = driver.findElement(By.xpath("//h1[text()='Apparel']"));
        Assert.assertEquals(apparelPageTitle.getText(), "Apparel");

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        // Click on the Digital downloads tab
        WebElement digitalDownloadsTab = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloadsTab.click();

        // Verify the text "Digital downloads"
        WebElement digitalDownloadsPageTitle = driver.findElement(By.xpath("//h1[text()='Digital downloads']"));
        Assert.assertEquals(digitalDownloadsPageTitle.getText(), "Digital downloads");
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        // Click on the Books tab
        WebElement booksTab = driver.findElement(By.linkText("Books"));
        booksTab.click();

        // Verify the text "Books"
        WebElement booksPageTitle = driver.findElement(By.xpath("//h1[text()='Books']"));
        Assert.assertEquals(booksPageTitle.getText(), "Books");
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        // Click on the Jewelry tab
        WebElement jewelryTab = driver.findElement(By.linkText("Jewelry"));
        jewelryTab.click();

        // Verify the text "Jewelry"
        WebElement jewelryPageTitle = driver.findElement(By.xpath("//h1[text()='Jewelry']"));
        Assert.assertEquals(jewelryPageTitle.getText(), "Jewelry");
    }
    @After
    public void tearDown(){
        driver.close();
    }

}


