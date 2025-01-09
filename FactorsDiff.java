import java.util.*;

class Number
{
    public static int Difference(int iNo)
    {
        int iAns = 0, i = 0, iSumF = 0, iSumN = 0;

        for(i = 1; i < iNo; i++)
        {
            if (iNo % i == 0) {
                
                iSumF += i;
            }
            else
            {
                iSumN += i;
            }
        }
        iAns = iSumN - iSumF;

        return iAns;
    }
}

public class FactorsDiff {
    
    public static void main(String[] args) {
        
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the number: ");
        iValue = sobj.nextInt();

        Number obj = new Number();

        int iRet = obj.Difference(iValue);

        System.out.println("Difference between non factors and factors is: "+iRet);
    }
}
