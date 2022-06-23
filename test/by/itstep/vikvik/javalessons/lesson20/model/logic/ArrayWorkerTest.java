package by.itstep.vikvik.javalessons.lesson20.model.logic;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayWorkerTest {
    @Test
    public void testCountNegativeValuePositive() {
        int[] array = {1, -2, 3, -4, 0, 5, -6};
        int expected = 3;

        int actual = ArrayWorker.countNegativeValue(array);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountNegativeValueWithAllNegativeElements() {
        int[] array = {-1, -2, -3, -4};
        int expected = array.length;

        int actual = ArrayWorker.countNegativeValue(array);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountNegativeValueWithAllPositiveElements() {
        int[] array = {1, 2, 3, 4, 5};
        int expected = 0;

        int actual = ArrayWorker.countNegativeValue(array);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountNegativeValueWithEmptyObject() {
        int[] array = {};   // int[] array = new int[0];
        int expected = 0;

        int actual = ArrayWorker.countNegativeValue(array);

        assertEquals(expected, actual);
    }

    @Test
    public void testCountNegativeValueWithNull() {
        int expected = -1;

        int actual = ArrayWorker.countNegativeValue(null);

        assertEquals(expected, actual);
    }

    @Test
    public void testChangeSignPositive() {
        int[] array = {1, -2, 3, 0, -4, 5};
        int[] expected = {-1, 2, -3, 0, 4, -5};

        ArrayWorker.changeSign(array);

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != expected[i]) {
//                fail();
//            }
//        }

        assertArrayEquals(expected, array);
    }

    @Test
    public void testChangeSignWithAllPositiveValues() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {-1, -2, -3, -4, -5};

        ArrayWorker.changeSign(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testChangeSignWithAllNegativeValues() {
        int[] array = {-1, -2, -3, -4, -5};
        int[] expected = {1, 2, 3, 4, 5};

        ArrayWorker.changeSign(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testChangeSignWithOneNegativeValue() {
        int[] array = {-1};
        int[] expected = {1};

        ArrayWorker.changeSign(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testChangeSignWithOnePositiveValue() {
        int[] array = {1};
        int[] expected = {-1};

        ArrayWorker.changeSign(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void testChangeSignWithOneZeroValue() {
        int[] array = {0};
        int[] expected = {0};

        ArrayWorker.changeSign(array);

        assertArrayEquals(expected, array);
    }

    @Test(expected = RuntimeException.class)
    public void testChangeSignWithEmptyObject() {
        int[] array = {};   // int[] array = new int[0];
        ArrayWorker.changeSign(array);
    }

    @Test(expected = RuntimeException.class)
    public void testChangeSignWithNull() {
        ArrayWorker.changeSign(null);
    }
}
