import java.util.*;

public class CodeForce158A {

    public static int Solution(int k, int Arr[])
    {
        int iCount = 0;
        
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= Arr[k-1] && Arr[i] > 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int n = sobj.nextInt();
        int k = sobj.nextInt();

        int Arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        int iRet = Solution(k, Arr);

        System.out.println(iRet);
    }
}
