package by.itstep.vikvik.javalessons.lesson20.model.logic;

public class ArrayWorker {
    public static int countNegativeValue(int[] array) {
        if (array == null) {
            return -1;
        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }

        return count;
    }

    public static void changeSign(int[] array)  {
        if (array.length == 0 || array == null) {
            throw new RuntimeException();
        }

        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
    }
}
