package br.com.chronosacademy.automacaoWeb;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.pages.CursosPage;
import br.com.chronosacademy.pages.PrincipalPage;
import org.junit.*;
import org.openqa.selenium.WebDriver;

public class TesteWeb {

    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage;
    CursosPage cursosPage;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driverWeb.getDriver().get("https://www.chronosacademy.com.br/");
        principalPage = new PrincipalPage(driver);
        cursosPage = new CursosPage(driver);
    }

    @After
    public void finalizaTeste(){
        driver.quit();
    }

    @Test
    public void primeiroTeste(){
        String Titulo = principalPage.getTitulo();
        Assert.assertEquals("Porque Tempo É Conhecimento", Titulo);
    }

    @Test
    public void segundoTeste(){
        principalPage.clickBotao();
        String titulo = cursosPage.getTitulo();
        Assert.assertEquals("AUTOMAÇÃO SEM COMPLICAÇÃO WEB 2.0", titulo);
    }
}
