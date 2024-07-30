package com.practicaseis.definitions;

import com.practicaseis.Step.ExitoValidationStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ExitoValidationDefinition {

    @Steps
    ExitoValidationStep exitoValidationStep;

    @Given("that I want to buy a television to watch the World Cup")
    public void that_i_want_to_buy_a_television_to_watch_the_world_cup() {
        exitoValidationStep.login_exito();
    }
    @When("I enter the virtual page of success and select the one I like the most")
    public void i_enter_the_virtual_page_of_success_and_select_the_one_i_like_the_most() {

    }
    @Then("I make the purchase so that it is sent to my house.")
    public void i_make_the_purchase_so_that_it_is_sent_to_my_house() {

    }
}
