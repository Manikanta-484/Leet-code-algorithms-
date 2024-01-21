/*
 Max Product of Two Integers
How to find maximum product of two integers in the array where all elements are positive.

Example

int[] intArray = {10,20,30,40,50};
maxProduct(intArray) // (40,50) */


public class Exercise {
    public String maxProduct(int[] intArray) {
        int maxProduct = 0;
        int maxProductIndexI = 0;
        int maxProductIndexJ = 0;

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if ((intArray[i] + intArray[j]) > maxProduct) {
                    maxProduct = intArray[i] + intArray[j];
                    maxProductIndexI = i;
                    maxProductIndexJ = j;
                }
            }
        }

        return "" + intArray[maxProductIndexI] + "," + intArray[maxProductIndexJ] + "";
    }
}