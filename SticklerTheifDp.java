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

public class SticklerTheifDp{

    public static int maxLoot(int []Arr, int []dp, int indx)
    {
        if(indx >= Arr.length) return 0;

        if(dp[indx] != -1) return dp[indx];

        int steal = Arr[indx]+maxLoot(Arr,dp,indx+2);
        int skip = maxLoot(Arr,dp, indx+1);

        return dp[indx] = Math.max(steal, skip);
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

        int []dp = new int[Num+1];
        for(int i = 0; i <= Num; i++)
        {
            dp[i] = -1;
        }
        System.out.println("Maximum Loot is: "+maxLoot(Arr,dp, 0));
    }
}