package JavaDSA.recursion_backtracking;


public class odd_even {
    public static void main(String[] args) {
        int n = 5;
        oddEven(n);
    }
    public static void oddEven(int n) {
        if(n==0) {
            return;
        }
        if(n%2!=0) {
            System.out.println(n);
        }
        oddEven(n-1);
        if(n%2==0) {
            System.out.println(n);
        }
    }
}
