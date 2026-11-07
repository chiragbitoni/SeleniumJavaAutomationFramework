package com.demoqa.pages.elements;

import org.openqa.selenium.By;

public class DynamicPropertiesPage extends ElementsPage {
    public By enableAfterBtn = By.id("enableAfter");
    public By colorChangeBtn = By.id("colorChange");
    public By visibleAfter = By.id("visibleAfter");

    public boolean isButtonEnabled() {
        return find(enableAfterBtn).isEnabled();
    }

    public String getColorChangeButtonColor() {
        return find(colorChangeBtn).getCssValue("color");
    }

    public boolean isVisibleAfterButtonDisplayed() {
        return find(visibleAfter).isDisplayed();
    }
}
