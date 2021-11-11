package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;

import com.crowdar.examples.constants.LoginMobileConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class LoginService {

    public static void doLogin(String email, String password){
        MobileActionManager.setInput(LoginMobileConstants.ID_EMAIL_LOGIN_LOCATOR, email);
        MobileActionManager.setInput(LoginMobileConstants.ID_PASSWORD_LOGIN_LOCATOR, password);
        MobileActionManager.click(LoginMobileConstants.ID_BUTTON_LOGIN_LOCATOR);

    }




}
