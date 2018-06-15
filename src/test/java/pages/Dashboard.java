package pages;

import control.Link;
import org.openqa.selenium.By;

public class Dashboard {

    public Link loginLink ;
    public Dashboard(){
        loginLink = new Link(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div/div/div[@class=\"HPHeaderLogin\"]/a/img"));
    }

}
