package com.practicaseis.Step;


import com.practicaseis.pages.ExitoFormValidationPage;
import com.practicaseis.pages.ExitoMenuPage;
import net.thucydides.core.annotations.Step;

public class ExitoValidationStep {


    ExitoFormValidationPage exitoFormValidationPage;


    @Step
    public void login_exito(){
        exitoFormValidationPage.open();


    }


}