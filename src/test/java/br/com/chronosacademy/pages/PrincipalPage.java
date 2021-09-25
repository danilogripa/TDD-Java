package br.com.chronosacademy.pages;

import br.com.chronosacademy.maps.PrincipalMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {
    WebDriver driver;
    PrincipalMap principalMap;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
        principalMap = new PrincipalMap();
        PageFactory.initElements(driver, principalMap);
    }

    public String getTitulo() {
        return principalMap.txtTitulo.getText();
    }

    public void clickBtn() {
        principalMap.btnTitulo.click();
    }
}
