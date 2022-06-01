package flow;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import page.GoogleMainPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class GoogleMainPageFlow {

    public GoogleMainPageFlow fillSearchField(String calc) {
        page(GoogleMainPage.class).getSearchField().sendKeys(calc);
        return this;
    }

    public GoogleMainPageFlow clickSearchButton() {
        page(GoogleMainPage.class).getSearchButton().click();
        return this;
    }

    public GoogleMainPageFlow tapNumberButtonInCalc(String numberButtons) {
        page(GoogleMainPage.class).getCalcNumberButtons().findBy(Condition.text(numberButtons)).click();
        return this;
    }

    public GoogleMainPageFlow tapSymbolButtonInCalc(String symbolButtons) {
        GoogleMainPage googleMainPage = new GoogleMainPage();
        $(By.cssSelector(String.format(googleMainPage.getCalcSymbolButtonsLocator(), symbolButtons))).click();
        return this;
    }

    public GoogleMainPageFlow assertCalcDisplayEnteredData(String enteredData) {
        page(GoogleMainPage.class).getInputDisplayField().shouldHave(Condition.text(enteredData));
        return this;
    }
}
