package br.com.chronosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteWeb {

    ChromeDriver driver;
    /*
    @BeforeClass
    @AfterClass
    @Before
    @After
    @RunWith(Cucumber.class)
    */
    @Before
    public void inicializaTeste(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br/");
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
