package ru.otus.array;

//import ru.otus.java.arrays.util.ArrayUtil;

public class Arrays {

    public int[] reverseArray(int[] array) {
        ArrayUtil.printArray(array);

        // TODO реализуйте код для создания перевернутого массива
        int[] result = new int[array.length];
        for(int i=0; i<array.length; i++) result[i] = array[array.length-1-i];

        return result;
    }

    public float average(int[] array) {
        // TODO реализуйте код для расчета среднего значения

        ArrayUtil.printArray(array);
        float result=0;
        for(int i=0;i<array.length; i++) result += array[i];
        result /= array.length;


        return result;
    }
}
