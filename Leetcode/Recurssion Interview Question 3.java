/* Recurssion Interview Question 3
   
 */

public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        var result =main.gcd(8,12);
        System.out.println(result);
    }

    public int gcd(int a, int b){
        if(a<0 || b<0){
            return -1;
        }
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}