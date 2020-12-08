package com.company;

import java.util.Arrays;

public class ArrayData {
    public static void main(String args[]) {
        int[] numbers ={9,7,8,10,1,2,3,4,5};
        System.out.println(numbers);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //2D Array

        int [][] numbers1 ={{1,2,3},{4,5,6}};
        System.out.println(numbers1);
        System.out.println(numbers1[1][2]);
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.deepToString(numbers1));


    }
}
