package collection.set;

import java.util.Arrays;

public class HashStart4 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {

        //{1, 2, 5, 8, 14, 99}
        //[null, 1, 2, null, null, 5, null, null, 8, .., 14 ....., 99]
        Integer[] inputArray = new Integer[CAPACITY];

        add(inputArray,1);
        add(inputArray,2);
        add(inputArray,5);
        add(inputArray,8);
        add(inputArray,14);
        add(inputArray,99);

        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue =14;
        int hashIndex = hashIndex(searchValue);
        System.out.println("searchValue hashIndex = " + hashIndex); // O(1)
        int result = inputArray[hashIndex];
        System.out.println(result);

    }

    private static void add(Integer[] inputArray, int value){
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

    static int hashIndex(int value){
        return value%10;
    }
}
