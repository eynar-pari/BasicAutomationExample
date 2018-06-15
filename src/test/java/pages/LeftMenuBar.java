package pages;

import control.Link;
import org.openqa.selenium.By;

public class LeftMenuBar {

    public Link logoutLink;

    public LeftMenuBar(){
        logoutLink = new Link(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));
    }
}
