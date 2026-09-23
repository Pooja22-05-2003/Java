/*
70. Climbing Stairs
Solved
        Easy
Topics
premium lock icon
        Companies
Hint
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


Constraints:

        1 <= n <= 45


*/
//package DP;
//
//public class A_Climbing_Staris {
//}


//*** 1. Brute Force: TC= O(2^n)   SC=call stack O(n)

class Solution {
    public int climbStairs(int n) {
        if(n==0| n==1) return 1;
        else return climbStairs(n-1)+climbStairs(n-2);
    }
}


// *** 2. Memoization : TC= O(n)   SC=O(n)+call stack O(n)

class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
    int solve(int n, int dp[]){
        if(dp[n]!=-1) return dp[n];
        dp[0]=1;
        if(n==0) return dp[0];
        dp[1]=1;
        if(n==1) return dp[1];

        for(int i=2;i<=n;i++){

            dp[i]=solve(i-1,dp)+solve(i-2,dp);
        }
        return dp[n];
    }

}

//3 Tabulation: TC= O(n)   SC=O(n)


class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        return solve(n,dp);
    }

    public int solve(int n,  int dp[]){
        dp[0]=1;
        if(n==0) return dp[0];
        dp[1]=1;
        if(n==1) return dp[1];

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}

//Best soltuion (Space+tc) TC:O(n), SC=O(1)

class Solution {
    int a=1;
    int b=1;
    int c=0;
    public int climbStairs(int n) {
        if(n==a|n==b) return 1;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}