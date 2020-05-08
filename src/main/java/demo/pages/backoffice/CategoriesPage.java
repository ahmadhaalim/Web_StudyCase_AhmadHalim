package demo.pages.backoffice;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoriesPage {
  public String categoryName = "";

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/categories");
  }

  public static String generateRandomCategoryName() {
    return "Category-" + System.currentTimeMillis();
  }

  public void inputCategoryName() {
    this.categoryName = generateRandomCategoryName();
    WebElement field = WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Category Name']"));
    field.sendKeys(this.categoryName);
  }

  public void clickCreateCategory() {
    waitABit();
    WebElement button = WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Category')]"));
    button.click();
  }

  public void clickSaveCategory() {
    WebElement button = WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary PhtzjEWwHfB2xdkEDI8ca']"));
    button.click();
  }

  public void inputCategorySameName() {
    waitABit();
    WebElement field = WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Category Name']"));
    field.sendKeys(this.categoryName);
  }

  public boolean categoryName() {
    WebElement text = WebDriverInstance.webDriver.findElement(By.xpath("//td[contains(text(),'" + this.categoryName + "')]"));
    return true;
  }

  public boolean sameNameNotif() {
    return WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='mk-alert pad2 closeable-true']"))
            .isDisplayed();
  }

  public void waitABit() {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
