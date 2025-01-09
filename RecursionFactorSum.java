import java.util.*;

class Recursion
{
    public static int Sum(int iNo, int i, int iSum){


        if(i <= (iNo/2))
        {
            if (iNo % i == 0) {
                
                iSum = iSum + i;
            }
            iSum = Sum(iNo, i+1, iSum);
        }

        return iSum;
    }
}


public class RecursionFactorSum {
    
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int iValue = sobj.nextInt();

        Recursion obj = new Recursion();

        int iRet = obj.Sum(iValue,1,0);
        System.out.println("Factors sum: "+iRet);
    }
}
