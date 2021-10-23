package br.com.chronosacademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#menuUser")
    public WebElement btnLogin;
    @FindBy(css = ".closeBtn")
    public WebElement btnFechar;
    @FindBy(css = ".PopUp")
    public WebElement divFechaModal;
    @FindBy(css = "*[name='username']")
    public WebElement inpUserName;
    @FindBy(css = "*[name='password']")
    public WebElement inpPassword;
    @FindBy(css = "*[name='remember_me']") //@FindBy(xpath = "//*[text() = 'REMEMBER ME']/../input")
    public WebElement inpRemember;
    @FindBy(id = "sign_in_btnundefined")// @FindBy(css = "#sign_in_btnundefined") //@FindBy(xpath = "//*[@id ='sign_in_btnundefined']")
    public WebElement btnSignIn;
    @FindBy(linkText = "CREATE NEW ACCOUNT") //@FindBy(xpath = "//*[text() = 'CREATE NEW ACCOUNT']")
    public WebElement linkCreateAccount;

    @FindBy(css = ".loader")
    public WebElement divLoader;
}
