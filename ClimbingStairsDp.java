// Given an array of integers cost[] where cost[i] is the cost of the ith step on a staircase. Once the cost is paid, you can either climb one or two steps. Return the minimum cost to reach the top of the floor.
// Assume 0-based Indexing. You can either start from the step with index 0, or the step with index 1.

// Examples:

// Input: cost[] = [10, 15, 20]
// Output: 15
// Explanation: Cheapest option is to start at cost[1], pay that cost, and go to the top.

import java.util.*;

public class ClimbingStairsDp{

    public static int MinCost(int []Arr,int indx, int []dp)
    {
        if(indx >= Arr.length) return 0;

        if(dp[indx] != -1) return dp[indx];

        return dp[indx] = Arr[indx] + Math.min(MinCost(Arr, indx+1, dp), MinCost(Arr, indx+2, dp));

    }
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of stairs: ");
        int Num = sobj.nextInt();

        int []Arr = new int[Num];

        System.out.println("Enter cost: ");
        for(int i = 0; i < Num; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        int []dp = new int[Num];

        for(int i = 0; i < Num; i++)
        {
            dp[i] = -1;
        }

        System.out.println("Minimum Cost is: "+Math.min(MinCost(Arr,0,dp), MinCost(Arr,1, dp)));
    }
}
