/*Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true  */

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr1));


    }

    private static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        int[] v = new int[arr.length];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;

            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                cnt++;
                i++;
            }

            // Check if cnt is already present in v
            for (int j = 0; j < idx; j++) {
                if (v[j] == cnt) {
                    return false;
                }
            }

            v[idx++] = cnt;
        }

        return true;
    }


    }

