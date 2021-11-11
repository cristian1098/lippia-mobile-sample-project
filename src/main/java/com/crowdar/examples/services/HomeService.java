package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.LoginMobileConstants;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class HomeService {


    public static void verifyButtonChanged(String buttonStatus) {

      Assert.assertTrue( MobileActionManager.getAttribute(HomeConstants.SWITCH_SHOW_NOTIFICATION,"checked").equals(buttonStatus));

    }

    public static void hamburguerClick() {
        MobileActionManager.click(LoginMobileConstants.HAMBURGUER_BUTTON_LOCATOR);

    }
    public static void settingsClick(){
        MobileActionManager.click(HomeConstants.BUTTON_SETTINGS);
    }
    public static void ShowNotificationsClick(){
        MobileActionManager.click(HomeConstants.SWITCH_SHOW_NOTIFICATION);
    }
    public static void projectsClick(){
        MobileActionManager.click(HomeConstants.PROJECTS_CARD);
    }
    public static void taskClick(){
        MobileActionManager.click(HomeConstants.TASK_BUTTON);
    }
    public static void taskListClick(){
        MobileActionManager.click(HomeConstants.ADD_BUTTON);
    }
    public static void inputTask(String task){
        MobileActionManager.setInput(HomeConstants.INPUT_TEXT,task);
    }
    public static void saveTaskClick(){
        MobileActionManager.click(HomeConstants.SAVE_TASK_BUTTON);
    }
    public static void comeBackHome(){
        MobileActionManager.click(LoginMobileConstants.HAMBURGUER_BUTTON_LOCATOR);
        MobileActionManager.click(HomeConstants.TEXT_TASK_PATH);
        MobileActionManager.click(HomeConstants.TIME_TRACKER_BUTTON);
    }


}
