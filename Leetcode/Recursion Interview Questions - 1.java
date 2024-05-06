/*Recursion Interview Questions - 1

        How to find the sum of digits of a positive integer number using recursion ?
Step 1: Recursive case the flow

        10--> 10/10 = 1 and Remainder = 0      f(n) = n%10 + f(n/10)

        54--> 54/10 = 5 and Remainder = 4

        112--> 112/10 =11 and Remainder = 2
                 11/10 = 1 and Remainder = 1
Step 2: Base case - the stopping criterion
        n = 0
 Step 3: Unintentional case - the constraint
         sumofDigits(-11) ??
         sumofDigits (1.5) ??  */

public class Main {
    public static void main(String[] args) {
        Main main =new Main();
        var result=main.sumofDigit(120);
        System.out.println(result);
    }

    public int sumofDigit(int n){
        if(n==0 || n<0){
            return 0;
        }
        return n%10+sumofDigit(n/10);
    }

}