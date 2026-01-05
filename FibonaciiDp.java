import java.util.*;

public class FibonaciiDp {

    public static int Fibo(int N, int []dp)
    {
        if(N <= 1) return N;

        if(dp[N] != -1) return dp[N];
        dp[N] = Fibo((N-1),dp)+Fibo((N-2),dp);
       
        return dp[N];
    }

    public static int Fibonacii(int Num)
    {
        int []dp = new int[Num+1];

        for(int i = 0; i <= Num; i++)
        {
            dp[i] = -1;
        }

        return Fibo(Num, dp);
    }

    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int Num = sobj.nextInt();

        System.out.println("Fibonacii number is: "+Fibonacii(Num));

    }
}
