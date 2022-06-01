package tests;

import base.BaseTest;
import flow.GoogleMainPageFlow;
import org.testng.annotations.Test;

public class CalculateInGoogleTest extends BaseTest {

    @Test
    public void calculateInGoogleTest() {
        new GoogleMainPageFlow()
                .fillSearchField("Калькулятор")
                .clickSearchButton()
                .tapNumberButtonInCalc("1")
                .tapSymbolButtonInCalc("умножение")
                .tapNumberButtonInCalc("2")
                .tapSymbolButtonInCalc("вычитание")
                .tapNumberButtonInCalc("3")
                .tapSymbolButtonInCalc("сложение")
                .tapNumberButtonInCalc("1")
                .assertCalcDisplayEnteredData("1 × 2 - 3 + 1")
                .tapSymbolButtonInCalc("равно")
                .assertCalcDisplayEnteredData("0");
    }
}
