package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.services.HomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class HomeSteps extends PageSteps {


    @And("verify that the state of the button is (.*)")
    public void verifyThatTheStateOfTheButtonChanged(String buttonStatus) {

        HomeService.verifyButtonChanged(buttonStatus);
        HomeService.comeBackHome();


    }

    @When("the user clicks the button show notifications")
    public void theUserClicksTheButton() {

        HomeService.ShowNotificationsClick();


    }


    @When("the user access to settings funcionality")
    public void theUserClicksTheHamburguerButton() {

        HomeService.hamburguerClick();
        HomeService.settingsClick();
    }

    @And("the user click in proyects")
    public void theUserClickInProyects() {
        HomeService.projectsClick();

    }

    @Then("the user add a (.*)")
    public void theUserAddATask(String task) {
        HomeService.taskClick();
        HomeService.taskListClick();
        HomeService.inputTask(task);
        HomeService.saveTaskClick();

    }

    @Then("verify that the task (.*) is added")
    public void verifyThatTheTaskTaskIsAdded(String task) {

        System.out.println();
    }
}
