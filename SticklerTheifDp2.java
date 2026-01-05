// Stickler the thief wants to loot money from the houses arranged in a line. He cannot loot two consecutive houses and aims to maximize his total loot.
// Given an array, arr[] where arr[i] represents the amount of money in the i-th house. Determine the maximum amount he can loot.

// Examples:

// Input: arr[] = [6, 7, 1, 3, 8, 2, 4]
// Output: 19
// Explanation: Maximum amount he can get by looting 1st, 3rd, 5th and 7th house, which is 6 + 1 + 8 + 4 = 19.
// Input: arr[] = [5, 3, 4, 11, 2]
// Output: 16
// Explanation: Maximum amount he can get by looting 1st and 4th house, which is 5 + 11 = 16.

import java.util.*;

public class SticklerTheifDp2{

    public static int maxLoot(int []Arr)
    {
        int n = Arr.length;

        int []dp = new int[n];
        dp[0] = Arr[0];
        dp[1] = Math.max(Arr[0], Arr[1]);

        for(int i = 2; i< n; i++)
        {
            dp[i] = Math.max(Arr[i]+dp[i-2], dp[i-1]);
        }
        return dp[n-1];
    }

    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int Num = sobj.nextInt();

        int []Arr = new int[Num]; 
        for(int i = 0; i < Num; i++)
        {
            Arr[i] = sobj.nextInt();
        }


        System.out.println("Maximum Loot is: "+maxLoot(Arr));
    }
}