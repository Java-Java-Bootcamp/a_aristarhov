package ru.otus.array;



public class Appl {
    public static void main(String[] args) {
        /*
        Arrays _arr = new Arrays();

        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(_arr.average(arr));

        int[] arr2 = _arr.reverseArray(arr);

        ArrayUtil.printArray(arr2);
*/

        Anagram a = new Anagram();
        System.out.println(a.check("acb   ", "    abc"));

    }
}
