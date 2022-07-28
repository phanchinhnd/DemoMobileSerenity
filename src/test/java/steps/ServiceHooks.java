package steps;

import core.AppiumBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.net.MalformedURLException;

public class ServiceHooks {
    AppiumBase appiumBase = new AppiumBase();
    @Before
    public void initTest() throws MalformedURLException {
        appiumBase.crateDriver();
    }
    @After
    public void afterHooks(Scenario scenario){
//        scenario.attach(((TakesScreenshot)AppiumBase.driver).getScreenshotAs(OutputType.BYTES),"image/png","image");
        appiumBase.teaDown();
    }
}
