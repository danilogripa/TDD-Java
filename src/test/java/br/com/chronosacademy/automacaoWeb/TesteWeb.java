package br.com.chronosacademy.automacaoWeb;

import br.com.chronosacademy.core.Driver;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TesteWeb {

    WebDriver driver;
    Driver driverWeb;
    /*
    @BeforeClass
    @AfterClass
    @Before
    @After
    @RunWith(Cucumber.class)
    */

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();

        driverWeb.getDriver().get("https://www.chronosacademy.com.br/");
    }

    @After
    public void finalizaTeste(){
        driver.quit();
    }

    @Test
    public void primeiroTeste(){
        String xpathTitulo = "//section[2]//h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String Titulo = txtTitulo.getText();
        Assert.assertEquals("Porque Tempo É Conhecimento", Titulo);
    }

    @Test
    public void segundoTeste(){
        System.out.println("Teste 2");
    }

    @Test
    public void terceiroTeste(){
        System.out.println("Teste 3");
    }

}
