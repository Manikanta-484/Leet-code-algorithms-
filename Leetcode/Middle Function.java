/* Middle Function
Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

myArray = [1, 2, 3, 4]
middle(myArray)  # [2,3] */


import java.util.Arrays;

public class  Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1, 1, 3};
        System.out.println(Arrays.toString(middle(arr1)));

    }

    private static int[] middle(int[] arr1) {
        if (arr1.length < 3) {
            return new int[0];
        }
        int[] result=new int[arr1.length-2];
        for(int i=1;i<arr1.length-1;i++){
            result[i-1]=arr1[i];
        }
       return result;
    }
   }


