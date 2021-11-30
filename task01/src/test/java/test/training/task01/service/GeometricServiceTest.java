package test.training.task01.service;

import by.putseta.task01.service.GeometricService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class GeometricServiceTest {

    GeometricService geometricService = new GeometricService();

    @DataProvider(name = "dataForCountAreaOfRectangle")
    public Object[][] createDataForAreaTriangle() {
        return new Object[][]{
                {new double[]{1}, 3},
                {new double[]{0}, 0},
                {new double[]{5}, 15},
        };
    }

    @Test(description = "check for counting the area of triangle", dataProvider = "dataForCountAreaOfRectangle")
    public void checkAreaOfTriangle(double arg[], double expected) {
        double actual = geometricService.countAreaOfRectangle(arg[0]);
        assertEquals(actual, expected);
    }
}
