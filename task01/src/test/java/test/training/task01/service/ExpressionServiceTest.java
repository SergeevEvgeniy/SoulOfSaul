package test.training.task01.service;

import by.putseta.task01.service.ExpressionService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ExpressionServiceTest {

    ExpressionService expressionService = new ExpressionService();

    @DataProvider(name = "dataForSwapNumberParts")
    public Object[][] createDataForSwapNumberParts() {
        return new Object[][]{
                {new double[]{111.333}, 333.111},
                {new double[]{000.000}, 000.000},
                {new double[]{-111.222}, -222.111},
                {new double[]{999.888}, 888.999},
        };
    }

    @Test(description = "check for find ordinary number of symbol", dataProvider = "dataForSwapNumberParts")
    public void checkOrdinaryNumber(double arg[], double expected) {
        double actual = expressionService.swapFractionalAndIntegerParts(arg[0]);
        assertEquals(actual, expected);
    }
}
