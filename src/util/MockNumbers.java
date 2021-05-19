package util;

public class MockNumbers {
    public int[] IntegerArray (int lenght) {

        int[] array = new int[lenght];

        for (int i = 0; i < lenght; i++)
            array[i] = i;

        return array;
    }
}
