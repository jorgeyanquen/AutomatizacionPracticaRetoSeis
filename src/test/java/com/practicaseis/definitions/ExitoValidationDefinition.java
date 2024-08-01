package com.practicaseis.definitions;

import com.practicaseis.Step.ExitoMenuStep;
import com.practicaseis.Step.ExitoValidationStep;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class ExitoValidationDefinition {


    @Steps
    ExitoValidationStep exitoValidationStep;


    @Steps
    ExitoMenuStep exitoMenuStep;


    @Given("that I want to buy a television to watch the World Cup")
    public void that_i_want_to_buy_a_television_to_watch_the_world_cup() {
        exitoValidationStep.login_exito();
    //    exitoValidationStep.validacionformulario();

    }
    @When("I enter the virtual page of success and select the one I like the most")
    public void i_enter_the_virtual_page_of_success_and_select_the_one_i_like_the_most(DataTable dtDatosForm) {
        List<List<String>> cells = dtDatosForm.cells();

        for(int i=1; i<cells.size(); i++){
            exitoMenuStep.diligenciar_pagina_Exito(cells, i);
            try{
                Thread.sleep(5000);
            }catch(InterruptedException e){

            }
        }
    }
    @Then("I make the purchase so that it is sent to my house.")
    public void i_make_the_purchase_so_that_it_is_sent_to_my_house() {

    }
}