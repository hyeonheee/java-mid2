package collection.set;

import java.util.Arrays;

public class HashSet3 {
    public static void main(String[] args) {

        // 입력 : {1,2,5,8,14,99}
        // [null, 1, 2, null,null .....]
        Integer[] inputArray = new Integer[100];
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));


        int searchVlaue = 99;
        Integer result = inputArray[searchVlaue]; //O(1)
        System.out.println("result = " + result);


    }
}
