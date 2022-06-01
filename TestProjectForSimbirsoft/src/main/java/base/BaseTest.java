package base;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod

    public void before() {
        Selenide.open("https://www.google.com/");
    }

}
