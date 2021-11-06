package br.com.chronosacademy.pages;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void clickBtnLogin(){
        Driver.visibilityOf(loginMap.btnLogin);
        loginMap.btnLogin.click();
    }

    public void clickBtnFechar(){
        Driver.visibilityOf(loginMap.btnFechar);
        loginMap.btnFechar.click();
    }

    public void clickDivFechaModal(){
        loginMap.divFechaModal.click();
    }

    public void setInpUserName(String username){
        if(username != null) loginMap.inpUserName.sendKeys(username);
    }

    public void setInpPassword(String password){
        if(password != null) loginMap.inpPassword.sendKeys(password);
    }

    public void clickInpRemember(){
        loginMap.inpRemember.click();
    }

    public void clickLinkCreateAccount(){
        loginMap.linkCreateAccount.click();
    }

    public void clickBtnSignIn(){
        aguardarLoader();
        loginMap.btnSignIn.click();
    }

    public boolean isBtnSignIn(){
        return loginMap.btnSignIn.isEnabled();
    }

    public void visibilityOfBtnFechar(){
        Driver.visibilityOf(loginMap.btnFechar);
    }
    public void invisibilityOfBtnFechar(){
        Driver.invisibilityOf(loginMap.btnFechar);
    }
    public void aguardarLoader(){
        Driver.attributeChange(loginMap.divLoader, "display", "none");
    }

    public String getUsuarioLogado(){
        Driver.visibilityOf(loginMap.textLogado);
        return loginMap.textLogado.getText();
    }

    public String getErroLogin(){
        Driver.visibilityOf(loginMap.textErroLogin);
        //Driver.attributeChange(loginMap.textErroLogin, "text", "Incorrect user name or password.");
        return loginMap.textErroLogin.getText();
    }
}
