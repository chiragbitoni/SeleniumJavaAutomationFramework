package com.demoqa.test.elements;

import com.demoqa.base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicPropertiesTest extends BaseTest {

    private void navigateToDynamicProperties() {
        homePage.goToElements();
        elementsPage.clickDynamicPropertiesCard();
    }

    //region TC014
    /*
        Test Case ID: TC014
        Test Summary: Validate that button enables successfully after 5 seconds.
    */
    @Step("TC014")
    @Test(description = "TC014: Validate that button enables successfully after 5 seconds.")
    public void TC014() {
        navigateToDynamicProperties();
        WebDriverWait wait = new WebDriverWait(basePage.getDriver(), Duration.ofSeconds(7));
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(dynamicPropertiesPage.enableAfterBtn));
        Assert.assertTrue(button.isEnabled(), "Button should be enabled after 5 seconds.");
    }
    //endregion

    //region TC015
    /*
        Test Case ID: TC015
        Test Summary: Validate that button text color changes successfully after 5 seconds.
    */
    @Step("TC015")
    @Test(description = "TC015: Validate that button text color changes successfully after 5 seconds.")
    public void TC015() {
        navigateToDynamicProperties();
        WebDriverWait wait = new WebDriverWait(basePage.getDriver(), Duration.ofSeconds(7));
        boolean classChanged = wait.until(ExpectedConditions.attributeContains(dynamicPropertiesPage.colorChangeBtn, "class", "text-danger"));
        Assert.assertTrue(classChanged, "Button class should contain 'text-danger' after 5 seconds.");
    }
    //endregion

    //region TC016
    /*
        Test Case ID: TC016
        Test Summary: Validate that button is visible after 5 seconds.
    */
    @Step("TC016")
    @Test(description = "TC016: Validate that button is visible after 5 seconds.")
    public void TC016() {
        navigateToDynamicProperties();
        WebDriverWait wait = new WebDriverWait(basePage.getDriver(), Duration.ofSeconds(7));
        WebElement visibleBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(dynamicPropertiesPage.visibleAfter));
        Assert.assertTrue(visibleBtn.isDisplayed(), "Button should be visible after 5 seconds.");
    }
    //endregion
}
