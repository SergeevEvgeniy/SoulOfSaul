package test.training.task01.service;

import by.putseta.task01.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ArithmeticServiceTest {

    private final ArithmeticService arithmeticService = new ArithmeticService();

    @DataProvider(name = "dataForCalculationAverageValue")
    public Object[][] createDataForAverageValue() {
        return new Object[][]{
                {new double[]{1, 3}, 2},
                {new double[]{0, 0}, 0},
                {new double[]{-1, 3}, 1},
                {new double[]{0, 0}, 0},
        };
    }

    @Test(description = "check for finding the arithmetic value with positive numbers", dataProvider = "dataForCalculationAverageValue")
    public void checkAverageValue(double arg[], double expected) {
        double actual = arithmeticService.countAverageValue(arg[0], arg[1]); //TODO: написать с провайдером
        assertEquals(actual, expected);
    }
}
