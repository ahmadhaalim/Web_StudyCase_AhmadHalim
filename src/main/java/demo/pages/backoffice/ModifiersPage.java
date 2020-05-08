package demo.pages.backoffice;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import demo.utils.RandomUtils;

import static demo.utils.RandomUtils.generateRandomItemPrice;

public class ModifiersPage {
  public String modifierName = "";
  public String optionName = "";
  public String priceName = "";
  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/modifier");
  }

  public void clickCreateModifier(){
    WebElement button = WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Modifier')]"));
    button.click();
  }

  public void inputModifierName(){
    this.modifierName = generateRandomModifierName();
    WebElement element = WebDriverInstance.webDriver.findElement(By.xpath("//input[@name='name']"));
    element.sendKeys(this.modifierName);
  }

  public void clickAddOrManageOptions(){
    WebElement button = WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']"));
    button.click();
  }

  public void clickOptionsAdd(){
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    WebElement button = WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Add Options')]"));
    button.click();
  }

  public void InputOptionName(String options){
    this.optionName = generateRandomModifierName();
    WebElement element = WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='form-group col-sm-6']" +
            "//input[@placeholder='Name']"));
    element.sendKeys(options);
  }

  public void inputOptionPrice(){
    this.priceName = generateRandomItemPrice();
    WebElement element = WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='form-group col-sm-6']" +
            "//input[@placeholder='Name']"));
    element.sendKeys(this.priceName);
  }

  public void clickSaveOptionDialog(){
    WebElement button = WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='modal-footer']//button" +
            "[@class='btn btn-primary'][contains(text(),'Save')]"));
    button.click();
  }

  public void clickSave(){
    WebElement button = WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Save')]"));
    button.click();
  }

  public boolean modifierName(){
    WebElement text = WebDriverInstance.webDriver.findElement(By.xpath("//td[contains(text(),'"+this.modifierName +"')]"));
    return true;
  }




  public static String generateRandomModifierName(){
    return "Modifier-" + System.currentTimeMillis();
  }

}
