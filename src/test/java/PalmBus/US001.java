package PalmBus;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class US001 {
    @Test
    public void test() throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Thread.sleep(7000);

/*
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "RealDevice");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability(MobileCapabilityType.APP, "C:/Users/fylmz/IdeaProjects/Palm_Bus/src/apps/PALMBUS_5.1.0 (2639.2)_Apkpure.apk");
        Thread.sleep(5000);
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Thread.sleep(7000);

        //PRECONDITION LOGIN

        MobileElement cancel = driver.findElementByXPath("//android.widget.Button[@text='Cancel']");
        cancel.click();
        Thread.sleep(3000);
        MobileElement menu = driver.findElementByXPath("//android.widget.TextView[@text='Menu']");
        menu.click();
        Thread.sleep(5000);
        MobileElement loginRegister = driver.findElementByXPath("//android.view.View[@text='Login / Register']");
        loginRegister.click();
        Thread.sleep(5000);
        MobileElement logiN = driver.findElementByXPath("//android.widget.Button[@text='LOG IN']");
        logiN.click();
        Thread.sleep(3000);
        MobileElement emailBox = driver.findElementByXPath("//android.widget.EditText[@text='Email']");
        emailBox.sendKeys("ilknuray1318@gmail.com");
        Thread.sleep(3000);
        MobileElement passwordBox = driver.findElementByXPath("//android.widget.EditText[@text='Password']");
        passwordBox.sendKeys("5314x1453");
        Thread.sleep(3000);
        MobileElement loginButton = driver.findElementByXPath("//android.widget.Button[@text='LOG IN']");
        loginButton.click();
        Thread.sleep(3000).*/
        MobileElement favorites = driver.findElementByXPath("//android.view.View[@text='Favorites']");
        Assert.assertTrue(favorites.isDisplayed());
        favorites.click();
        Thread.sleep(3000);

        MobileElement ecranFavorite = driver.findElementByXPath("//android.widget.TextView[@text='Favorites']");
        Assert.assertTrue(ecranFavorite.isDisplayed());

        MobileElement addFavorite = driver.findElementByXPath("//android.widget.Button[@text='Add a favorite']");
        addFavorite.click();
        Thread.sleep(3000);

        MobileElement ecranAddFavorite = driver.findElementByXPath("//android.widget.TextView[@text='Add a favorite destination']");
        Assert.assertTrue(ecranAddFavorite.isDisplayed());

        MobileElement adressBox = driver.findElementByXPath("//android.widget.EditText[@text='Favorite address']");
        adressBox.sendKeys("105 route de sospel");
        Thread.sleep(3000);

        MobileElement saveAdress = driver.findElementByXPath("android.widget.Button");
        saveAdress.click();
        Thread.sleep(3000);


    }
}