package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.support.FindBy;

@Getter
public class GoogleMainPage {

    final public String calcSymbolButtonsLocator = "div[aria-label='%s']";

    @FindBy(css = "input[class='gLFyf gsfi']")
    private SelenideElement searchField;

    @FindBy(css = "input[class='gNO89b']")
    private SelenideElement searchButton;

    @FindBy(css = "div[class='XRsWPe AOvabd']")
    private ElementsCollection calcNumberButtons;

    @FindBy(css = "span[jsname='VssY5c']")
    private SelenideElement inputDisplayField;
}
