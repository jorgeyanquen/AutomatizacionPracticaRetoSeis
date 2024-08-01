package com.practicaseis.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ExitoMenuPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"__next\"]/header/section/div/div[1]/div[2]/form/input")
    public WebElement txtmenuForms;

    @FindBy(xpath = "//*[@id=\"__next\"]/header/section/div/div[1]/div[2]/form/button")
    public WebElement btnbuscar;

    @FindBy(xpath = "//*[@id=\"__next\"]/header/section/div/div[1]/div[1]/button/span")
    public WebElement lblFormValidation;

    //Menu forms
    @FindBy(id = "desktop-store-filter-button--3")
    public WebElement menuForms;


    public void menuFormValidation(){
        menuForms.click();
    }


    public void menu(String datoPrueba){
        txtmenuForms.click();
        txtmenuForms.clear();
        txtmenuForms.sendKeys(datoPrueba);
    }

    public void botonbuscar(){
        btnbuscar.click();

    }



}