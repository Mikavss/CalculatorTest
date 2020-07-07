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
                {4, 2, 2},
                {0, -1, 1},
                {8, 4, 4},
        };
    }

    @Test(dataProvider = "testEqualsSum")
    public void testEqualsSum(int one, int two, int tree) {
        Assert.assertEquals(one, Math.sumTest(two, tree));
    }

    /**
     * Проверяем негативный сценарий рассчёта суммы
     */

    @DataProvider(parallel = true)
    public Object[][] testEqualsNegativeSum() {
        return new Object[][]{
                {5, 2, 2},
                {1, -1, 1},
                {100, 4, 4},
        };
    }

    @Test(dataProvider = "testEqualsNegativeSum")
    public void testEqualsNegativeSum(int one, int two, int tree) {
        Assert.assertNotEquals(one, Math.sumTest(two, tree));
    }

    /**
     * Проверяем позитивный сценарий рассчёта разности
     */
    @DataProvider(parallel = true)
    public Object[][] testEqualsDiff() {
        return new Object[][]{
                {-2, 2, 4},
                {-4, -1, 3},
                {1, 4, 3},
        };
    }

    @Test(dataProvider = "testEqualsDiff")
    public void testEqualsDiff(int one, int two, int tree) {
        Assert.assertEquals(one, Math.diffTest(two, tree));
    }

    /**
     * Проверяем негативный сценарий рассчёта разности
     */
    @DataProvider(parallel = true)
    public Object[][] testEqualsNegativeDiff() {
        return new Object[][]{
                {-3, 2, -7},
                {2, -1, 0},
                {-78, 4, 7},
        };
    }

    @Test(dataProvider = "testEqualsNegativeDiff")
    public void testEqualsNegativeDiff(int one, int two, int tree) {
        Assert.assertNotEquals(one, Math.diffTest(two, tree));
    }

    /**
     * Проверяем позитивный сценарий рассчёта деления
     */
    @DataProvider(parallel = true)
    public Object[][] testEqualsDiv() {
        return new Object[][]{
                {4, 8, 2},
                {-2, 6, -3},
                {4, -12, -3},
        };
    }

    @Test(dataProvider = "testEqualsDiv")
    public void testEqualsDiv(int one, int two, int tree) {
        Assert.assertEquals(one, Math.divTest(two, tree));
    }

    /**
     * Проверяем негативный сценарий рассчёта деления
     */
    @DataProvider(parallel = true)
    public Object[][] testEqualsNegativeDiv() {
        return new Object[][]{
                {5, 8, 4},
                {-7, 6, -2},
                {8, -12, -4},
        };
    }

    @Test(dataProvider = "testEqualsNegativeDiv")
    public void testEqualsNegativeDiv(int one, int two, int tree) {
        Assert.assertNotEquals(one, Math.divTest(two, tree));
    }

    /**
     * Проверяем позитивный сценарий рассчёта умножения
     */
    @DataProvider(parallel = true)
    public Object[][] testEqualsMult() {
        return new Object[][]{
                {20, 4, 5},
                {-12, 6, -2},
                {0, -1, 0},
        };
    }

    @Test(dataProvider = "testEqualsMult")
    public void testEqualsMult(int one, int two, int tree) {
        Assert.assertEquals(one, Math.multTest(two, tree));
    }

    /**
     * Проверяем негативный сценарий рассчёта умножения
     */
    @DataProvider(parallel = true)
    public Object[][] testEqualsNegativeMult() {
        return new Object[][]{
                {20, 6, 4},
                {-12, 6, 0},
                {7, -1, -6},
        };
    }

    @Test(dataProvider = "testEqualsNegativeMult")
    public void testEqualsNegativeMult(int one, int two, int tree) {
        Assert.assertNotEquals(one, Math.multTest(two, tree));
    }
}
