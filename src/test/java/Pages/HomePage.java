package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
;
public class HomePage {
    WebDriver driver;
    By Computers = By.xpath("(//a[@href='/computers'])[1]");
    By  Notebooks = By.xpath("//img[@title='Show products in category Notebooks']");
    By VerifySixNoteBooks = By.xpath("//strong[@class='current-item']");
    By AddToCart = By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[1]");
    By ItemAddToCart = By.xpath("//button[@class='button-1 add-to-cart-button']");
    By ShoppingCart = By.xpath("//*[@class='cart-label']");
    By TermsConditions = By.xpath("//input[@name='termsofservice']");
    By CheckOutItem = By.xpath("//button[@class='button-1 checkout-button']");
    By Register =By.xpath("//button[@class='button-1 register-button']");
    By SelectGender = By.xpath("//input[@id='gender-male']");
    By FirstName = By.xpath("//input[@name='FirstName']");
    By LastName = By.xpath("//input[@name='LastName']");
    By Email  = By.xpath("(//input[@type='email'])[1]");
    By CompanyName =By.xpath("(//input[@id='Company'])");
    By PassWord = By.xpath("//input[@id='Password']");
    By ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By RegisterDetails = By.xpath("//button[@id='register-button']");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void CheckHomePage()
    {
        driver.findElement(Computers).click();
        driver.findElement(Notebooks).click();
        driver.findElement(VerifySixNoteBooks).clear();
        driver.findElement(AddToCart).click();
        driver.findElement(ItemAddToCart).click();
        driver.findElement(ShoppingCart).click();
        driver.findElement(TermsConditions).click();
        driver.findElement(CheckOutItem).click();
        driver.findElement(Register).click();
        driver.findElement(SelectGender).click();
        driver.findElement(FirstName).sendKeys("Sourav");
        driver.findElement(LastName).sendKeys("Thakur");
        driver.findElement(Email).sendKeys("sourav221@gmail.com");
        driver.findElement(CompanyName).sendKeys("Info");
        driver.findElement(PassWord).sendKeys("qwertyuiop");
        driver.findElement(ConfirmPassword).sendKeys("qwertyuiop");
        driver.findElement(RegisterDetails).click();
        String actual = driver.findElement(VerifySixNoteBooks).getText();
    }
}
