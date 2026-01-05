// Given a grid of size m x n, the task is to determine the number of distinct paths from the top-left corner to the bottom-right corner. At each step, one can either move down or right. Given the integers m and n, return the number of unique paths from the top-left corner to the bottom-right corner.

// Note: The test cases are designed such that the answer will always fit within a 32-bit integer.

// Examples:

// Input: m = 3, n = 3
// Output: 6
// Explanation: Let the given input 3*3 grid is filled as such:
// A B C
// D E F
// G H I
// The possible unique paths which exists to reach 'I' from 'A' following above conditions are as follows: ABCFI, ABEHI, ADGHI, ADEFI, ADEHI, ABEFI.


import java.util.*;

public class NoOfPathsDp{

    public static int paths(int m, int n, int[][]dp)
    {
        if(m==1 && n==1) return 1;
        if (m < 1 || n < 1) return 0;
        
        if(dp[m][n] != -1) return dp[m][n];

        return dp[m][n] = paths(m, n-1, dp)+paths(m-1, n, dp);
    }

    public static int numberOfPaths(int m, int n)
    {
        int [][]dp = new int[m+1][n+1];

        for(int i = 0; i<= m; i++)
        {
            for(int j = 0; j <= n; j++)
            {
                dp[i][j] = -1;
            }
        }

        return paths(m, n, dp);
    }
    public static void main(String[]args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter of rows: ");
        int m = sobj.nextInt();

        System.out.println("Enter of columns: ");
        int n = sobj.nextInt();
        
        System.out.println("Number of paths: "+numberOfPaths(m,n));
    }
}