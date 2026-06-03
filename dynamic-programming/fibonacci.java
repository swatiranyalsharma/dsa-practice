import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int[] dp = new int[A+1];
        Arrays.fill(dp, -1);
        int ans = fibonacciNumber(A, dp);
        System.out.print(ans);
        
    }
    public static int fibonacciNumber(int n, int[] dp){
        if(n <=1) return dp[n] = n;
        if(dp[n] != -1) return dp[n];
        int ans = fibonacciNumber(n-1, dp) + fibonacciNumber(n-2, dp);
        return dp[n] = ans;
    }
}