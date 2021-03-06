package br.com.chronosacademy.pages;

import br.com.chronosacademy.maps.CursoMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CursosPage {
    WebDriver driver;
    CursoMap cursoMap;

    public CursosPage(WebDriver driver) {
        this.driver = driver;
        cursoMap = new CursoMap();
        PageFactory.initElements(driver, cursoMap);
    }

    public String getTitulo() {
       return cursoMap.h2Titulo.getText();
    }
}
