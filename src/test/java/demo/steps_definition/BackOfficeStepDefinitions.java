package demo.steps_definition;

import demo.pages.backoffice.CategoriesPage;
import demo.pages.backoffice.DashboardPage;
import demo.pages.backoffice.ItemLibraryPage;
import demo.pages.backoffice.LoginPage;
import demo.pages.backoffice.ModifiersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BackOfficeStepDefinitions {

  LoginPage loginPage = new LoginPage();
  DashboardPage dashboardPage = new DashboardPage();
  CategoriesPage categoriesPage = new CategoriesPage();
  ItemLibraryPage itemLibraryPage = new ItemLibraryPage();
  ModifiersPage modifiersPage = new ModifiersPage();

  @Given("User open moka backoffice login page")
  public void userOpenMokaBackofficeLoginPage() {
    loginPage.openPage();
  }

  @When("User input email/phone {string} on backoffice login page")
  public void userInputEmailOnBackofficeLoginPage(String emailOrPhone) {
    loginPage.inputEmailorPhone(emailOrPhone);
  }

  @When("User input password {string} on backoffice login page")
  public void userInputPasswordOnBackofficeLoginPage(String password) {
    loginPage.inputPassword(password);
  }

  @When("User click Sign in on backoffice login page")
  public void userClickSignInOnBackofficeLoginPage() {
    loginPage.clickSignIn();
  }


  @Then("User successfully login on backoffice")
  public void userSuccessfullyLoginOnBackoffice() {
    Assert.assertTrue(dashboardPage.isOnPage());
  }

  @When("User go to menu categories on backoffice")
  public void userGoToMenuCategoriesOnBackoffice() {
    categoriesPage.openPage();
  }


  @When("User go to menu item library on backoffice")
  public void userGoToMenuItemLibraryOnBackoffice() {
    itemLibraryPage.openPage();
  }

  @When("User go to menu modifiers on backoffice")
  public void userGoToMenuModifiersOnBackoffice() {
    modifiersPage.openPage();
  }

  @And("User click create categories")
  public void userClickCreateCategories() {
    categoriesPage.clickCreateCategory();
  }

  @And("User input the category name")
  public void userInputTheCategoryName() {
    categoriesPage.inputCategoryName();
  }


  @And("User click save")
  public void userClickSave() {
    categoriesPage.clickSaveCategory();
  }

  @Then("User see saved category with the same name")
  public void userSeeSavedCategoryWithTheSameName(){
    Assert.assertTrue(categoriesPage.categoryName());
  }

  @And("User click create modifier")
  public void userClickCreateModifier() {
    modifiersPage.clickCreateModifier();
  }

  @And("User input the modifier name")
  public void userInputTheModifierName() {
    modifiersPage.inputModifierName();
  }

  @And("User click Add or Manage Options")
  public void userClickAddOrManageOptions() {
    modifiersPage.clickAddOrManageOptions();
  }

  @And("User click the add options button")
  public void userClickTheAddOptionsButton() {
    modifiersPage.clickOptionsAdd();
  }

  @And("User input option name {string}")
  public void userInputOptionName(String options) {
    modifiersPage.InputOptionName(options);
  }

  @And("User input option price")
  public void userInputOptionPrice() {
    modifiersPage.inputOptionPrice();
  }

  @And("User click save on the add option dialog")
  public void userClickSaveOnTheAddOptionDialog() {
    modifiersPage.clickSaveOptionDialog();
  }

  @And("User click save on the modifier page")
  public void userClickSaveOnTheModifierPage() {
    modifiersPage.clickSave();
  }

  @Then("User see the new modifier")
  public void userSeeTheNewModifier() {
    boolean result = modifiersPage.modifierName();
    Assert.assertTrue(result);
  }

  @When("User click create item button")
  public void userClickCreateItemButton() {
    itemLibraryPage.clickCreateItem();
  }

  @And("User input the item name")
  public void userInputTheItemName() {
    itemLibraryPage.inputItemName();
  }

  @And("User click the save button")
  public void userClickTheSaveButton() {
    itemLibraryPage.clickItemSave();
  }

  @Then("User see the new item")
  public void userSeeTheNewItem() {
    boolean result = itemLibraryPage.checkItemName();
    Assert.assertTrue(result);
  }

  @And("User input the item price")
  public void userInputTheItemPrice() {
    itemLibraryPage.inputItemPrice();
  }

  @And("User input the item SKU")
  public void userInputTheItemSKU() {
    itemLibraryPage.inputItemSku();
  }

  @And("User see the same item price")
  public void userSeeTheSameItemPrice() {
    boolean result = itemLibraryPage.checkItemPrice();
    Assert.assertTrue(result);
  }

  @And("User see the same item SKU")
  public void userSeeTheSameItemSKU() {
    boolean result = itemLibraryPage.checkItemSku();
    Assert.assertTrue(result);
  }

  @And("User input the category name with the same name")
  public void userInputTheCategoryNameWithTheSameName() {
    categoriesPage.inputCategorySameName();
  }

  @Then("Then User see {string} notification")
  public void thenUserSeeNotification(String arg0) {
    boolean result = categoriesPage.sameNameNotif();
    Assert.assertTrue(result);
  }
}
