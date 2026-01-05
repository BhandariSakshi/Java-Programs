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

public class MaxPathSumDp2 {

    

    public static int maximumPath(int [][]Arr)
    {
        int m = Arr.length, n = Arr[0].length;
        int [][]dp = new int[n][m];

        for(int j =0; j<n; j++)
        {
            dp[0][j] = Arr[0][j];
        }

        for(int i = 1; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                int left = (j-1 >= 0) ? dp[i-1][j-1] : 0;
                int up = dp[i-1][j];
                int right = (j+1 < n) ? dp[i-1][j+1] : 0;
                dp[i][j] = Arr[i][j] + Math.max(left, Math.max(up,right));
            }
        }

        int max = -1;

        for(int j = 0; j < n; j++)
        {
            max  = Math.max(max, dp[m-1][j]);
        }
        return max;
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
