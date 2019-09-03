/*
 * @lc app=leetcode id=552 lang=java
 *
 * [552] Student Attendance Record II
 */
class Solution {

    static final int MOD = (int) (1e9+7);

    public int checkRecord(int n) {
        
        long[] P = new long[n + 1];
        long[] L = new long[n + 1];
        P[0] = P[1] = L[1] = 1;
        for(int i = 2; i <= n; i++) {
            P[i] = (P[i-1] + L[i-1]) % MOD;
            L[i] = (P[i-1] + P[i-2]) % MOD;
        }

        long res = (P[n] + L[n]) % MOD;
        for(int i = 0; i < n; i++) {
            long s = ((P[i] + L[i]) % MOD * (P[n-i-1] + L[n-i-1]) % MOD) % MOD;
            res = (res + s) % MOD; 

        }
        return (int)res;
    }
}


