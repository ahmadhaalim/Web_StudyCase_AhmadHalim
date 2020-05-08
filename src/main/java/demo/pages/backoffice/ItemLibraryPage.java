package demo.pages.backoffice;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


import java.text.NumberFormat;

import static demo.utils.RandomUtils.*;

public class ItemLibraryPage {
  public String foodName = "";
  public String foodPrice = "";
  public String foodSku = "";
  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/list");
  }

  public void clickCreateItem(){
    waitABit();
    WebElement button = WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Item')]"));
    button.click();
  }

  public void inputItemName(){
    this.foodName = generateRandomFoodName();
    waitABit();
    WebElement element = WebDriverInstance.webDriver.findElement(By.xpath("//input[@name='name']"));
    element.sendKeys(this.foodName);
  }

  public void clickItemSave(){
    WebElement button = WebDriverInstance.webDriver.findElement(By.xpath("//button[@class=" +
            "'btn btn-primary no-outline']"));
    button.click();
  }

  public void inputItemPrice(){
    this.foodPrice = generateRandomItemPrice();
    waitABit();
    WebElement element = WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Price']"));
    element.sendKeys(this.foodPrice);
  }

  public void inputItemSku(){
    this.foodSku = generateRandomSKU();
    waitABit();
    WebElement element = WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='SKU']"));
    element.sendKeys(this.foodSku);
  }

  public boolean checkItemPrice(){
    DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

    formatRp.setCurrencySymbol("Rp. ");
    formatRp.setGroupingSeparator('.');

    kursIndonesia.setDecimalFormatSymbols(formatRp);
    String format = kursIndonesia.format(Integer.parseInt(this.foodPrice));
    System.out.printf(format);
    WebElement text = WebDriverInstance.webDriver.findElement(By.xpath("//td[contains(text(),'"+format+"')]"));
    return true;
  }

  public boolean checkItemSku(){
    WebElement text = WebDriverInstance.webDriver.findElement(By.xpath("//td[contains(text(),'"+this.foodSku +"')]"));
    return true;
  }

  public boolean checkItemName(){
    WebElement text = WebDriverInstance.webDriver.findElement(By.xpath("//td[contains(text(),'"+this.foodName +"')]"));
    return true;
  }

  public void waitABit(){
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
