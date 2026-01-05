// You are given a matrix mat[][] of size n x m where each element is a positive integer. Starting from any cell in the first row, you are allowed to move to the next row, but with specific movement constraints. From any cell (r, c) in the current row, you can move to any of the three possible positions :

// (r+1, c-1) — move diagonally to the left.
// (r+1, c) — move directly down.
// (r+1, c+1) — move diagonally to the right.
// Find the maximum sum of any path starting from any column in the first row and ending at any column in the last row, following the above movement constraints.

// Examples :

// Input: mat[][] = [[3, 6, 1], [2, 3, 4], [5, 5, 1]]
// Output: 15
// Explaination: The best path is (0, 1) -> (1, 2) -> (2, 1). It gives the maximum sum as 15.

import java.util.*;

public class MaxPathSumDp {

    public static int path(int [][]Arr, int r, int c, int [][]dp)
    {
         int n = Arr.length, m = Arr[0].length;

         if(r == n || c < 0 || c == m) return Integer.MIN_VALUE;
         if(r == n-1) return Arr[r][c];

         if(dp[r][c] != 0) return dp[r][c];

         int left = path(Arr, r+1, c-1, dp);
         int down = path(Arr, r+1, c, dp);
         int right = path(Arr, r+1, c+1, dp);

         return dp[r][c] = Arr[r][c] + Math.max(left, Math.max(down, right));


    }

    public static int maximumPath(int [][]Arr)
    {
        int n = Arr.length, m = Arr[0].length;
        int [][]dp = new int[n][m];

        int ans = -1;
        for(int j =0; j<m; j++)
        {
            ans = Math.max(ans,path(Arr,0,j, dp));
        }
        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int n = sobj.nextInt();

         System.out.println("Enter number of columns: ");
        int m = sobj.nextInt();

        int [][]Arr = new int[n][m];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Maximum path sum is: "+maximumPath(Arr));
    }
}
