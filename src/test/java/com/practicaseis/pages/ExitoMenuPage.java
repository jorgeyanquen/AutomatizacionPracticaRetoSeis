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

    public void menu(String datoPrueba){
        txtmenuForms.click();
        txtmenuForms.clear();
        txtmenuForms.sendKeys(datoPrueba);
    }

    public void botonbuscar(){
        btnbuscar.click();
      //  String strMensaje = lblFormValidation.getText();
       // assertThat(strMensaje, containsString("Menú"));
    }


}
