package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_BIRTH_DAY_SELECT ="//div[contains(@class, \"large_form\")]/div/div/span/span/select[1]";
    public static final String XPATH_BIRTH_MONTH_SELECT ="//div[contains(@class, \"large_form\")]/div/div/span/span/select[2]";
    public static final String XPATH_BIRTH_YEAR_SELECT ="//div[contains(@class, \"large_form\")]/div/div/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_BIRTH_DAY_SELECT));
        Select selectDay = new Select(selectCombo);
        selectDay.selectByIndex(10);

        selectCombo = driver.findElement(By.xpath(XPATH_BIRTH_MONTH_SELECT));
        Select selectMonth = new Select(selectCombo);
        selectMonth.selectByIndex(2);

        selectCombo = driver.findElement(By.xpath(XPATH_BIRTH_YEAR_SELECT));
        Select selectYear = new Select(selectCombo);
        selectYear.selectByValue("1980");
    }

}
