package steps;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/demoCalculator.feature",
        glue = "steps",
        plugin = {"pretty"}
)

public class Runner {
//    static AppiumDriverLocalService appiumService = null;
//    AppiumBase appiumBase = new AppiumBase();
//    @Before
//    public void initTest() throws MalformedURLException {
//        appiumBase.crateDriver();
//    }
//    public static void startAppiumServer() throws IOException {
//        appiumService = AppiumDriverLocalService.buildDefaultService();
//        appiumService.start();
//    }

//    @After
//    public void afterTest() {
//        appiumBase.teaDown();
//    }
//    public static void stopAppiumServer() {
//        appiumService.stop();
//    }

}