import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr={1,0,2,0,0,9,0};
        int nonzeroindex=0;
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=0){
                int temp=arr[index];
                arr[index]=arr[nonzeroindex];
                arr[nonzeroindex]=temp;
                nonzeroindex++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}