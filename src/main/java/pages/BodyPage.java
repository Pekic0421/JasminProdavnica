package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class BodyPage extends BasePage{


    //Webelementi
    @FindBy(xpath = "//img[@class = 'product-image-photo']")
    WebElement parfemChloe;

    @FindBy(xpath = "//div[@id = 'option-label-imp_volume-206-item-91431']")
    WebElement militrazaParfema20ml;

    @FindBy(xpath = "//button[@id = 'product-addtocart-button']")
    WebElement dodajUkorpu;

    @FindBy(xpath = "//img[@alt = 'Pupa Its Delicious Sugar Candy Balm']")
    WebElement pupaBalm;

    @FindBy(xpath = "//div[@class = 'product-addto-links']")
    WebElement dodajUlistuZeljaIkonica;


    //Konstruktor
    public BodyPage(ChromeDriver driver) {
        super(driver);
        print("Body");
    }


    //Metode nad webelementima
    public void clickParfemChloe() {
        print("clickParfemChloe");
        parfemChloe.click();
    }

    public void dodajUkorpu20mmParfema() {
        print("dodajUkorpu20mmParfema");
        militrazaParfema20ml.click();
        dodajUkorpu.click();
    }

   public void clickPupaBalm() {
        print("clickPupaBalm");
        pupaBalm.click();
   }

    public boolean isSearchResultsPresent() {
        print("isSearchResultsPresent");
        return isElementPresent(pupaBalm);
    }

   public void clickDodajUListuZeljaIkonica(){
        print("clickDodajUListuZeljaIkonica");
        dodajUlistuZeljaIkonica.click();
   }
}
