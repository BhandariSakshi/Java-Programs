import java.util.*;

class Digits
{
    public static int Difference(int iNo)
    {
        int iAns = 0, iSumE = 0, iSumO = 0;
        
        while (iNo > 0) 
        {
            
            int iDigit = iNo % 10;

            if (iDigit % 2 == 0) {
                
                iSumE += iDigit;
            }
            else
            {
                iSumO += iDigit;
            }

            iNo = iNo / 10;
        }

        iAns = iSumE - iSumO;

        return iAns;
    }
    
}

public class SumEvenOddDigitDiff {
    
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number:");
        int iValue = sobj.nextInt();

        Digits obj = new Digits();

        int iRet = obj.Difference(iValue);
        System.out.println("Difference between even and odd digit: "+ iRet);

    }
}
