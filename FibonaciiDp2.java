import java.util.*;

public class FibonaciiDp2 {

    
//Tabulation
    public static int Fibonacii(int Num)
    {
        int []dp = new int[Num+1];

        if(Num > 0) dp[1] = 1;

        for(int i = 2; i <= Num; i++)
        {
            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[Num];
    }

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int Num = sobj.nextInt();

        System.out.println("Fibonacii number is: "+Fibonacii(Num));

    }
}
