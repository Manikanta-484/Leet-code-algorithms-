/*
   Recursion Interview Questions-2
   How to calculate power of a number using recursion?

   step 1: Recursive case-the flow

     X^n=x*x*x*..(n times)..*x
     2^4=2*2*2*2

     x^n=x*x^n-1

   step 2: Base case-the stopping criterion
    -n=0
    -n=1

    step 3: unintentional case -the constraint
      -power(2,1.2)??
      -power(2,-1)??

      
 */
public class Main {
    public static void main(String[] args) {
        Main main =new Main();
        var result=main.power(2,3);
        System.out.println(result);
    }

    public int power(int base,int exp){
        if(exp<0 ){
            return -1;
        }
        if(exp==0){
            return 1;
        }
        return base*power(base,exp-1);
  }
}