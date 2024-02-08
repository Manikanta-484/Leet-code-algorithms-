//Find the single Number from Array(ie, The Number which has no duplicates
// Eg: [1,2,1,4,2]-------->  4

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
      int[] array={1,2,1,4,2};
      int singleNum=checkforduplicate(array);
        System.out.println(singleNum);
    }

    public static int checkforduplicate(int[] arr){
        int result=0;
        for(int num : arr){
            result ^=num;
        }
        return result;
    }
}