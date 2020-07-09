package ru.lanit.framework.steps;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.lanit.testng.Math;

public class MathTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Подготовка перед тестами");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Чистим после тестов");
    }


    /**
     * Проверяем позитивный сценарий рассчёта суммы
     */

    @DataProvider(parallel = true)
    public Object[][] testEqualsSum() {
        return new Object[][]{
                {4, 2, 2},          // проверяем +/+
                {0, -1.768, 1.768}, // проверяем Дробное и +/-
                {-8, -4, -4},       // проверяем -/-
                {0, Double.MAX_VALUE, -Double.MAX_VALUE} // проверяем граничные значения
        };
    }

    @Test(dataProvider = "testEqualsSum")
    public void testEqualsSum(double one, double two, double tree) {
        Assert.assertEquals(one, Math.sumTest(two, tree));
    }

    /**
     * Проверяем негативный сценарий рассчёта суммы
     */

    @DataProvider(parallel = true)
    public Object[][] testEqualsNegativeSum() {
        return new Object[][]{
                {5, 2, 2},
                {1, -1.6478, 6.478},
                {100, -4, -455},
                {Double.MIN_VALUE, -675.67, 4556.445}
        };
    }

    @Test(dataProvider = "testEqualsNegativeSum")
    public void testEqualsNegativeSum(double one, double two, double tree) {
        Assert.assertNotEquals(one, Math.sumTest(two, tree));
    }

    /**
     * Проверяем позитивный сценарий рассчёта разности
     */
    @DataProvider(parallel = true)
    public Object[][] testEqualsDiff() {
        return new Object[][]{
                {-2, 2, 4},
                {3.8, 2.3, -1.5},
                {-1, -4, -3},
                {Double.MAX_VALUE, Double.MAX_VALUE, 0}
        };
    }

    @Test(dataProvider = "testEqualsDiff")
    public void testEqualsDiff(double one, double two, double tree) {
        Assert.assertEquals(one, Math.diffTest(two, tree));
    }

    /**
     * Проверяем негативный сценарий рассчёта разности
     */
    @DataProvider(parallel = true)
    public Object[][] testEqualsNegativeDiff() {
        return new Object[][]{
                {3, 2, 7},
                {2, -1.886, 0.7556},
                {-78, -4, -5},
                {0, Double.MAX_VALUE, -Double.MIN_VALUE}
        };
    }

    @Test(dataProvider = "testEqualsNegativeDiff")
    public void testEqualsNegativeDiff(double one, double two, double tree) {
        Assert.assertNotEquals(one, Math.diffTest(two, tree));
    }

    /**
     * Проверяем позитивный сценарий рассчёта деления
     */
    @DataProvider(parallel = true)
    public Object[][] testEqualsDiv() {
        return new Object[][]{
                {4, 8, 2},
                {-1, 3.6, -3.6},
                {4, -12, -3},
                {Double.MIN_VALUE, Double.MIN_VALUE, 1}
        };
    }

    @Test(dataProvider = "testEqualsDiv")
    public void testEqualsDiv(double one, double two, double tree) {
        Assert.assertEquals(one, Math.divTest(two, tree));
    }

    /**
     * Проверяем негативный сценарий рассчёта деления
     */
    @DataProvider(parallel = true)
    public Object[][] testEqualsNegativeDiv() {
        return new Object[][]{
                {5, 8, 4},
                {0, 6, 0},
                {8, -4.567, -4.55},
                {2.3, Double.MAX_VALUE, 456}
        };
    }

    @Test(dataProvider = "testEqualsNegativeDiv")
    public void testEqualsNegativeDiv(double one, double two, double tree) {
        Assert.assertNotEquals(one, Math.divTest(two, tree));
    }


    /**
     * Проверяем позитивный сценарий рассчёта умножения
     */
    @DataProvider(parallel = true)
    public Object[][] testEqualsMult() {
        return new Object[][]{
                {20, 4, 5},
                {-16.25, 6.5, -2.5},
                {6, -1, -6},
                {Double.MAX_VALUE, Double.MAX_VALUE, 1}
        };
    }

    @Test(dataProvider = "testEqualsMult")
    public void testEqualsMult(double one, double two, double tree) {
        Assert.assertEquals(one, Math.multTest(two, tree));
    }

    /**
     * Проверяем негативный сценарий рассчёта умножения
     */
    @DataProvider(parallel = true)
    public Object[][] testEqualsNegativeMult() {
        return new Object[][]{
                {20, 6, 4},
                {12, 6.6, 0.6},
                {7, -1.6, -6},
                {Double.MIN_VALUE, Double.MAX_VALUE, -2}
        };
    }

    @Test(dataProvider = "testEqualsNegativeMult")
    public void testEqualsNegativeMult(double one, double two, double tree) {
        Assert.assertNotEquals(one, Math.multTest(two, tree));
    }
}
