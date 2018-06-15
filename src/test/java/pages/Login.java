package pages;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

public class Login {

    public Button loginButton;
    public TextBox userTextBox;
    public TextBox pwdTextBox;
    public CheckBox rememberCheckBox;

    public Login(){
       loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));
       userTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
       pwdTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
       rememberCheckBox = new CheckBox(By.id("ctl00_MainContent_LoginControl1_CbRemember"));
    }


}
