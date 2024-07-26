public class Main {
    public static int add(int a , int b){
        while (b != 0 ){
            int carry = a&b;
            a=a^b;
            b=carry<<1;

        }
        return a;
    }
    public static void main(String[] args) {
        int a = 10 ;
        int b = 30;
        int result = add(a,b);
        System.out.println("result of adding two numbers without + : "+ result);
    }
}