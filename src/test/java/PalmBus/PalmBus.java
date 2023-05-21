package PalmBus;

import appium.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class PalmBus extends BaseClass {

    @Test
    public void palmbus() throws MalformedURLException, InterruptedException {
        AndroidDriver driver = setup();


        //LOGIN REGISTER
        driver.findElementById("android:id/button1").click();
        driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();

        //L'utilisateur appuie sur l'option du menu.
        driver.findElementById("com.is.android.cannes:id/navigation_menu").click();

        driver.findElementByXPath("//android.view.View[@text='Login / Register']").click();

        driver.findElementByXPath("//android.widget.Button[@text='LOG IN']").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Email']").sendKeys("ilknuray1318@gmail.com");

        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.EditText[@text='Password']").sendKeys("5314x1453");
        Thread.sleep(3000);
        driver.findElementByXPath("//android.widget.Button[@text='LOG IN']").click();

        //Confirme que le menu affiche l'option des favoris.
        String expectedFavText = "Favorites";
        String actualFavText = driver.findElementByXPath("//android.view.View[@text='Favorites']").getText();
        Assert.assertEquals(actualFavText, expectedFavText);
       // Thread.sleep(3000);
        driver.findElementByXPath("//android.view.View[@text='Favorites']").click();


        //Confirme l'arrivée à l'écran favoris

        String expectedAddText = "Add a favorite";
        String actualAddText = driver.findElementById("com.is.android.cannes:id/buttonEmptyView").getText();

        Assert.assertEquals(expectedAddText, actualAddText);

        //L'utilisateur peut ajoute une nouvelle adress favorite sur un appareil mobile.
        driver.findElementById("com.is.android.cannes:id/buttonEmptyView").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Favorite address']").click();
        driver.findElementByXPath("//android.widget.EditText[@text='Search']").sendKeys("Menton Garavan");
        driver.findElementByXPath("//android.widget.TextView[@text='Menton Garavan']").isDisplayed();
        driver.findElementByXPath("//android.widget.TextView[@text='Menton Garavan']").click();
        //driver.findElementById("com.is.android.cannes:id/searchRecyclerView").click();

        String expectedSaveText = "Save this favorite";
        String actualSaveText = driver.findElementById("com.is.android.cannes:id/buttonValid").getText();
        Assert.assertEquals(expectedSaveText, actualSaveText);
        driver.findElementById("com.is.android.cannes:id/buttonValid").click();

        //L'utilisateur peut supprimer avec succès une adresse favorite.
        driver.findElementById("com.is.android.cannes:id/menu").click();

        driver.findElementByXPath("//android.widget.TextView[@text='Delete']").click();

        driver.findElementByXPath("//android.widget.TextView[@text='You do not have favorites yet']").isDisplayed();

        //L'utilisateur doit pouvoir définir l'adresse spécifiée comme destination d'un itinéraire sur la page d'accueil.

    }
}
