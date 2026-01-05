// Given an array of integers cost[] where cost[i] is the cost of the ith step on a staircase. Once the cost is paid, you can either climb one or two steps. Return the minimum cost to reach the top of the floor.
// Assume 0-based Indexing. You can either start from the step with index 0, or the step with index 1.

// Examples:

// Input: cost[] = [10, 15, 20]
// Output: 15
// Explanation: Cheapest option is to start at cost[1], pay that cost, and go to the top.

import java.util.*;

public class ClimbingStairsDp2{

    public static int MinCost(int []Arr)
    {
        int Num = Arr.length;
        int []dp = new int[Num];

        dp[0] = Arr[0];
        dp[1] = Arr[1];

        for(int i = 2; i< Num; i++)
        {
            dp[i] = Arr[i] + Math.min(dp[i-1], dp[i-2]);
        }
        return Math.min(dp[Num-1], dp[Num-2]);

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

        System.out.println("Minimum Cost is: "+MinCost(Arr));
    }
}
