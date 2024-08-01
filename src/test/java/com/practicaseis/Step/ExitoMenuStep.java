package com.practicaseis.Step;

import com.practicaseis.pages.ExitoFormValidationPage;
import com.practicaseis.pages.ExitoMenuPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class ExitoMenuStep {

    ExitoMenuPage exitoMenuPage;
    ExitoFormValidationPage exitoFormValidationPage;

    @Step
    public void diligenciar_pagina_Exito(List<List<String>> data, int id){
        exitoMenuPage.menu(data.get(id).get(0).trim());
        exitoMenuPage.botonbuscar();
        exitoMenuPage.menuFormValidation();



    }
}